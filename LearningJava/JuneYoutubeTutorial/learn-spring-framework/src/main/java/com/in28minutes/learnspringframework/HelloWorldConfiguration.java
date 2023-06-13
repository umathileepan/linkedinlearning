package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};

record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Uma";
    }

    @Bean
    public int age(){
        return 36;
    }

    @Bean
    public String address(){
        return "2 Gale rd, Wellipark";
    }

    @Bean
    public Person person(){
       return new Person("Thileepan", 40);

    }

    @Bean
    public Address personAddress(){
        return new Address("Downstreet", "London");

    }
}
