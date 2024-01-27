import java.lang.*;
import java.util.*;
public class QuadEqu
{
    public static void main(String a[])
    {
        int x,y,z,eq;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        x=sc.nextInt();
        System.out.println("Enter y:");
        y=sc.nextInt();
        System.out.println("Enter z:");
        z=sc.nextInt();

        eq=y*y-4*x*z;
        if(eq>0)
        {
            System.out.println("Roots are real and different");
        }
        else if(eq==0)
        {
            System.out.println("Roots are real and equal");
        }
        else
        {
            System.out.println("Roots are complex and different");
        }
    }
}