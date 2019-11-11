package com.mnp.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExampleApplication.class, args);
    }

    public int addition(int a, int b) {
        return a * b;
    }
}

