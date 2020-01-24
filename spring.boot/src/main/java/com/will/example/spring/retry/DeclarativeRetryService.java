package com.will.example.spring.retry;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class DeclarativeRetryService {

    @Retryable(RuntimeException.class)
    public void doBiz() {
        throw new RuntimeException("any exp");
    }

    @Recover
    public void recover() {
        //recover
    }
}
