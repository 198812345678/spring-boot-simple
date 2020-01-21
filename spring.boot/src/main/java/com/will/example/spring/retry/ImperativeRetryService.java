package com.will.example.spring.retry;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.SocketTimeoutException;

@Service
public class ImperativeRetryService {

    public void test() {
        System.out.println("===== do something =====");
        throw new RuntimeException("any exp");
    }

    public void timeoutService() throws IOException {
        System.out.println("=====a remote timeout=====");
        throw new IOException("timeout", new SocketTimeoutException());
    }
}
