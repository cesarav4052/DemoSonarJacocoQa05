package com.qa.demoSonarJacocoQa.controller;

public class DemoTest {
        public void test() {
        String s = null;
        s.length(); // NullPointerException -> debería marcar SonarLint
    }
}
