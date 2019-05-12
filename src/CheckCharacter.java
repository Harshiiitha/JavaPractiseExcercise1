
import java.io.*;
import java.util.Scanner;
public class CheckCharacter{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        ch=sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Capital Letter");
        }
        else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Small Letter");
        }
        else if(ch>='0'&&ch<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Symbol");
        }

    }
}
