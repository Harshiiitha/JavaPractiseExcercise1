
import java.io.*;
import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args)
    {
        String word;
        String word1="";
        String word2="";
        int n,j,k,m,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        word=sc.next();
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.print(word);
        m=n;
        k=word.length()-1;
        while(n>=0)
        {
            word1+=word.charAt(k);
            k--;
            n--;
        }
        for(j=m-1;j>=0;j--)
        {
            word2+=word1.charAt(j);
        }
        for(i=1;i<=m;i++)
        {
            System.out.print(word2);
        }


    }
}
