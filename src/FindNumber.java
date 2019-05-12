

import java.io.*;
import java.util.Scanner;
public class FindNumber{
  public   static void findNumber(int number)
    {

        if(number>20&&number<30)
        {
            if(number%2==0)
            {
              System.out.println("jerry");
            }
            else{
                System.out.println("tom");
            }
        }

    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        findNumber(n);
    }
}
