package com.orange.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author chensy
 * @date 2024/3/30
 */
public class SaasAppStarter {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("saas-app-starter.xml");
        context.start();
        System.in.read();
    }
}
