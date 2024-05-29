package Challenge;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FillingTheBlanks {
    public static void main(String[] args){
        //Declare the Scanner class
        Scanner scanner = new Scanner(System.in);
        //Season of the year
        String season = "";
        System.out.println("Please give the season of the year: ");
        season=scanner.next();

        //Adjective
        String adjectiveWord = "";
        System.out.println("Please give the adjective word to describe the season: ");
        adjectiveWord=scanner.next();

        //number
        int number = 0;
        System.out.println("Please give a number of coffee you drink in winter: ");
        number=scanner.nextInt();

        System.out.println("On a " + adjectiveWord + " " + season + " " + "day, I drink a minimum of " + number + "  cups of coffee");
    }
}
