
import java.io.*;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        String word;
        String reversedword="";
        int n,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        word=sc.next();
        n=word.length();
        for(j=n-1;j>=0;j--)
        {
            reversedword=reversedword+word.charAt(j);
        }
        System.out.println("Reversed word is  "+ reversedword);
    }
}
