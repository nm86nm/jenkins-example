package com.mnp.jenkinsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsExampleApplicationTest {

    @Test
    void addition() {
        JenkinsExampleApplication jenkinsExampleApplication = new JenkinsExampleApplication();
        assertEquals(7, jenkinsExampleApplication.addition(2,5));
    }
}