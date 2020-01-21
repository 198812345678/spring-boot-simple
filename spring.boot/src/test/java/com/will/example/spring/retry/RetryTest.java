package com.will.example.spring.retry;

import com.will.example.spring.boot.spring.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.retry.*;
import org.springframework.retry.policy.CircuitBreakerRetryPolicy;
import org.springframework.retry.policy.ExceptionClassifierRetryPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.policy.TimeoutRetryPolicy;
import org.springframework.retry.support.DefaultRetryState;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RetryTest {

    @Resource
    private DeclarativeRetryService declarativeRetryService;

    @Resource
    private ImperativeRetryService imperativeRetryService;

    @Test
    public void test_注解() {
        declarativeRetryService.doBiz();
    }

    @Test
    public void test_api() {
        RetryTemplate template = new RetryTemplate();

        template.setRetryPolicy(new SimpleRetryPolicy());

        Boolean result = template.execute(
                (RetryContext context) -> {
                    //do something
                    return true;
                },
                context -> {
                    //recover
                    return true;
                }
                );
    }

    @Test
    public void test_SimpleRetryPolicy() {
        RetryTemplate template = new RetryTemplate();

        template.setRetryPolicy(new SimpleRetryPolicy());

        Boolean result = template.execute((RetryContext context) -> {
            imperativeRetryService.test();
            return true;
        });
    }

    @Test
    public void test_SimpleRetryPolicy_traverse() throws IOException {
        RetryTemplate template = new RetryTemplate();

        Map<Class<? extends Throwable>, Boolean> retryableExceptions = new HashMap<>();
        retryableExceptions.put(SocketTimeoutException.class, true);

        template.setRetryPolicy(new SimpleRetryPolicy(3, retryableExceptions, true));

        Boolean result = template.execute((RetryContext context) -> {
            imperativeRetryService.timeoutService();
            return true;
        });
    }

    @Test
    public void test_TimeoutRetryPolicy() {
        RetryTemplate template = new RetryTemplate();

        TimeoutRetryPolicy timeoutRetryPolicy = new TimeoutRetryPolicy();
        timeoutRetryPolicy.setTimeout(200);
        template.setRetryPolicy(timeoutRetryPolicy);

        Boolean result = template.execute((RetryContext context) -> {
            imperativeRetryService.test();
            return true;
        });
    }

    @Test
    public void test_ExceptionClassifierRetryPolicy() {
        RetryTemplate template = new RetryTemplate();

        Map<Class<? extends Throwable>, RetryPolicy> policyMap = new HashMap<>();
        policyMap.put(RuntimeException.class, new SimpleRetryPolicy());

        ExceptionClassifierRetryPolicy policy = new ExceptionClassifierRetryPolicy();
        policy.setPolicyMap(policyMap);
        template.setRetryPolicy(policy);

        Boolean result = template.execute((RetryContext context) -> {
            imperativeRetryService.test();
            return true;
        });
    }

    @Test
    public void test_CircuitBreakerRetryPolicy() throws InterruptedException {
        RetryTemplate template = new RetryTemplate();

        CircuitBreakerRetryPolicy policy = new CircuitBreakerRetryPolicy();
        policy.setResetTimeout(30);//熔断超时时间
        policy.setOpenTimeout(20);//窗口时间
        template.setRetryPolicy(policy);

        Object key = "circuit";
        boolean isForceRefresh = false;

        for (int i = 0; i < 1; i++) {
            try {
                RetryState state = new DefaultRetryState(key, isForceRefresh);
                int finalI = i;
                Boolean result = template.execute((RetryContext context) -> {
                    Thread.sleep(5);
                    imperativeRetryService.test();
                    return true;
                }, (context) -> {
                    System.out.println("=====recover !!======");
                    Thread.sleep(5);
                    return true;
                }, state);
            } catch (Exception e) {
            }
        }
    }

    @Test
    public void test_RetryState() {
        RetryTemplate template = new RetryTemplate();

        template.setRetryPolicy(new SimpleRetryPolicy());
        Object key = "stateKey";
        RetryState state = new DefaultRetryState(key);
            Boolean result = template.execute((RetryContext context) -> {
            imperativeRetryService.test();
            return true;
        }, state);
    }

}
