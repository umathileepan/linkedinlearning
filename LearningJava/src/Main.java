import java.sql.SQLOutput;

import static java.lang.System.in;
import java.util.Scanner;

public class Main {
    /*public static double calculateSalary(){
        int maxHoursPerDay = 40;
        int noOfWeekPerYear = 52;
        System.out.println("Number of hours employee work per week: ");
        Scanner input = new Scanner(System.in);
        int workingHoursPerWeek = input.nextInt();
        System.out.println("Salary per hour: ");
        double salaryPerHour = input.nextDouble();
        System.out.println("How many days of vacation has been taken: ");
        int numberOfVacation = input.nextInt();
        double vacationSalary = salaryPerHour * (numberOfVacation * maxHoursPerDay);
        double totalSalary = ((workingHoursPerWeek * salaryPerHour) * noOfWeekPerYear) - vacationSalary;
        return totalSalary;
    }*/
    public static void main(String[] args) {

        /*double salary = calculateSalary();
        System.out.println("Employee's yearly salary: " + salary);*/

        /*System.out.println("Hello World from the IntelliJ IDE!");

        int studentAge = 15;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Jones";
        String studentLastName = "Adam";

        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA " + studentGPA);

        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA " + studentGPA);

        System.out.println("Pick a number between 1 - 10");
        Scanner num = new Scanner(System.in);
        int pickedNum = num.nextInt();

        if(pickedNum < 5){
            System.out.println("Enjoy the good luck friends bring you");
        } else{
            System.out.println("You shoes bring your luck");
        }

        Scanner scanner = new Scanner(System.in);
        boolean onSongRepeat = true;
        while(onSongRepeat) {
            System.out.println("Current song is playing");
            System.out.println("Would you like not to repeat the song? If so answer : yes");
            String answer = scanner.next();

            if (answer.equals("yes")) {
                onSongRepeat = false;
            }
        }
            System.out.println("Next song is playing");

        String question = "What is the java code to print something in the screen?";
        String choiceOne = "system.in";
        String choiceTwo = "System.out.println()";
        String choiceThree = "system.out";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (correctAnswer.equals(answer)) {
            System.out.println("Good luck next time! Your answer is wrong.");
        } else {
            System.out.println("Congratulation! Your answer is correct.");
        }
        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while(base <= 0){
            System.out.println("That's invalid. Please input the base of the triangle (in inches");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while(height <= 0){
            System.out.println("That's invalid. Please input the height of the triangle (in inches)");
            height = input.nextDouble();
        }
        double area = (base * height) / 2;
        System.out.println("The area is: " + area);*/



    }
}
