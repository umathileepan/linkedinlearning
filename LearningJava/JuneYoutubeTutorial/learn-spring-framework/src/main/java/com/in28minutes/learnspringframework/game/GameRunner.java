package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.GamingConsole;

import java.sql.SQLOutput;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.up();
        game.right();
    }
}
