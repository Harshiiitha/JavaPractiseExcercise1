
import java.io.*;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {

        int original_number = 29;
        int min_value = 1;
        int max_value = 50;
        int user_number;
        while(true) {
            System.out.println("Enter a number between 1 and 50");
            Scanner sc = new Scanner(System.in);
            user_number = sc.nextInt();
            if(user_number>original_number)
            {
                System.out.println("Number guessed is more than original number");
                continue;
            }
            else if(user_number<original_number)
            {
                System.out.println("Number guessed is less than original number");
                continue;
            }
            else
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }
}
