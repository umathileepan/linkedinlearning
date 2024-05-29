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
            valid = changePassword(proposedPassword());
        } while (!valid);

        System.out.println("The proposed password is valid");

        scanner.close();
    }

    private static String proposedPassword() {
    }

    private static void printPasswordRules() {
    }

    public static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage = "";
        if (newPassword.length() <= 8) {
            valid = false;
            errorMessage += "\n Password must be at least 8 characters long.";
        }

        if (newPassword.equals(password)) {
            valid = false;
            errorMessage += "\n It cannot be the same as old password.";
        }

        if (newPassword.equals(username)) {
            System.out.println("Does not contain the username");

        } else {
            System.out.println("You have created your password successfully");

        }

        if(!valid){
            System.out.println(errorMessage);
        }
        return valid;
    }
}
