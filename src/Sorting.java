
import java.io.*;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args)
    {
        int number,sum=0;
        int i=0,j=0,n=0,k=0,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();
        int digit=number;
        while(number>0)
        {
            number=number/10;
            n++;

        }
        int a[]=new int[n];

        while(digit>0)
        {   a[i++]=digit%10;
            digit=digit/10;

        }

        for(k=0;k<n;k++)
        {
            for(j=k+1;j<n;j++)
            {

                if(a[k]<a[j])
                {
                    temp=a[k];
                    a[k]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Sorted number is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        if(sum>15)
        {
            System.out.print(" True");
        }
        else
        {
            System.out.print(" False");
        }

    }
}
