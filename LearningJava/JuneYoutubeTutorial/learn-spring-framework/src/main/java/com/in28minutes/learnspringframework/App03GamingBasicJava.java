package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PackmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
