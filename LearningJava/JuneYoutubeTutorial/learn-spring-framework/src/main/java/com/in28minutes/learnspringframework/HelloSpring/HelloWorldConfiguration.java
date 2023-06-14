package com.in28minutes.learnspringframework.HelloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age,Address address){};

record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){return "Uma"; }

    @Bean
    public int age(){
        return 36;
    }

    @Bean(name="address2")
    public String address(){
        return "2 Gale rd, Wellipark";
    }

    @Bean
    public Person person(){
       return new Person("Thileepan", 40, new Address("4 High Street", "Epsom"));

    }
    @Bean
    public Address personAddress(){
        return new Address("Downstreet", "London");

    }

    @Bean
    public Person personCallMethod2(){
        return new Person(name(),age(),personAddress());
    }

    @Bean
    public Person personParameter(String name,int age,Address personAddress){
        return new Person(name,age,personAddress);
    }
}
