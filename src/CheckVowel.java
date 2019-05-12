
import java.io.*;
import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args)
    {
        String word;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        word=sc.next();
        for(i=0;i<word.length();i++)
        {
            char letter=word.charAt(i);
            if(letter>='0'&&letter<='9')
            {
                System.out.print("Not a letter  ");
            }
            else if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
            {
                System.out.print("Vowel  ");
            }
            else
            {
                System.out.print("Consonant  ");
            }


        }



    }
}
