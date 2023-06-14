package com.in28minutes.learnspringframework.HelloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        //Launch a Spring Context
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //Configure the things that we want Spring to manage - @Configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personAddress"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("personCallMethod2"));
        System.out.println(context.getBean("personParameter"));

    }
}
