
import java.io.*;
import java.util.Scanner;
public class SumInputs {
    public static void main(String[] args)
    {
        int i;
        int n,k,sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of inputs");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=sc.nextInt();
            sum=sum+k;
        }
        System.out.println(sum);
    }
}
