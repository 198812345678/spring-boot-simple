package com.will.example.spring.retry;

import com.will.example.spring.boot.spring.boot.bean.Foo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.SocketTimeoutException;

@Service
public class ImperativeRetryService {

    @Resource
    private Foo foo;

    public void test() {
        System.out.println("===== do something =====");
        throw new RuntimeException("any exp");
    }

    public void timeoutService() throws IOException {
        System.out.println("=====a remote timeout=====");
        throw new IOException("timeout", new SocketTimeoutException());
    }
}
