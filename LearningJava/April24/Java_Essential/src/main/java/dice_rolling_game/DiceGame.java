package dice_rolling_game;

import static java.lang.Math.random;

public class DiceGame {
    public static void main(String[] args){
        int totalSpace = 0;
        System.out.println("You are on start position: " + totalSpace);
        for(int i=1; i<6; i++){
            double die = random()*7;
            int space = (int)die;
            System.out.println(space);
            totalSpace += space;
            System.out.println("You are on space " + totalSpace);
            System.out.println("You need " + (20-totalSpace) + " to win");
            if(totalSpace == 20) {
                System.out.println("You are win");
                break;
            }

        }

    }
}
