
import java.io.*;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int digit = number;
        int number1=0;
        int rem;
        int x,sum=0;
        while (number > 0)
        {
            rem = number % 10;
            number1 = number1 * 10 + rem;
            number=number/10;
        }
        if (number1 == digit) {

            System.out.print(number1 + " is palindrome and ");
            while(number1>0)
            {
                x=number1%10;
                if(x%2==0)
                {
                    sum=sum+x;
                }
                number1=number1/10;
            }
            if (sum > 25) {
                System.out.println("sum is greater than 25");
            } else {
                System.out.println("sum is less than 25");
            }


        } else {
            System.out.print(digit+ "is not a palindrome");
        }
    }
}

