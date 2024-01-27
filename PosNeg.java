import java.lang.*;
import java.util.*;
public class PosNeg
{
    public static void main(String a[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Positive number");
        }
        else if(n<0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
