import java.util.Scanner;

public class LoopAndScanner {
    public static void main(String[] args){
        int count = 1;
        int[] numbers = {1,3,4,5,7,9,11,13,15};

        while(count < 10){
            System.out.println("Count is : " + count);
            count++;
        }

        for(int num: numbers){
            System.out.println(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd: ");
        int num = scanner.nextInt();
        if(num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
