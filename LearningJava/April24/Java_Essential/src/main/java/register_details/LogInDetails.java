package register_details;

import java.util.Scanner;

public class LogInDetails {
    private static String username = "johndoe";
    private static String password = "ABC_1234";
    public static void main(String[] args) {
        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Please enter your new password: ");
            var newPassword = scanner.nextLine();
            valid = changePassword(newPassword);
        } while (!valid);

        System.out.println("The proposed password is valid");

        scanner.close();
    }

    private static void printPasswordRules() {
        System.out.println("Password must be 8 or more character");
        System.out.println("It cannot be user name");
        System.out.println("It cannot be old password");
        System.out.println("It has to have at least a capital letter");
        System.out.println("It has to have a special character");
    }

    public static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage = "";
        if (newPassword.length() <= 8) {
            valid = false;
            errorMessage += "\n Password must be at least 8 characters long.";
        }

        if(newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n must include a special char";
        }

        if (newPassword.equals(password)) {
            valid = false;
            errorMessage += "\n It cannot be the same as old password.";
        }

        if (newPassword.toUpperCase().contains(username.toUpperCase())) {
            valid = false;
            errorMessage += "\n Cannot contain the username";

        }

        if(!valid){
            System.out.println(errorMessage);
        }
        return valid;
    }
}
