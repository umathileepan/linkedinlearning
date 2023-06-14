package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.sun.source.tree.BreakTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PackmanGame();
        return game;
    }

    @Bean
    public GameRunner runner(GamingConsole game){
            var runner = new GameRunner(game);
            return runner;
    }
}
