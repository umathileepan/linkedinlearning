package com.in28minutes.learnspringframework.game;

public class PackmanGame implements GamingConsole{
    public void up(){
        System.out.println("Jump High");
    }

    public void down(){
        System.out.println("Down slowly");
    }

    public void left(){
        System.out.println("Jump back");
    }

    public void right() {
        System.out.println("Run fast");
    }
}
