
package discretestructureschapter6problem1;
import java.util.*;

/**
 * Author: Tejas Shah Date: 12/7/2015 Due: 12/18/2015 Chapter 1 Computer Projects
 * Given a positive integer n and a nonnegative integer not
 * exceeding n, find the number of r-permutations and r-combinations
 * of a set with n elements
 * This deals with combination.
 * @author shaht_000
 */
public class Combination
{

   public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter the value of n");
    int n=s.nextInt();
    
    
    System.out.println("Enter the combination suffix (r)");
    int r=s.nextInt();

    long res=1;

        if(n>=r)
        {
            res=getFact(n)/(getFact(n-r)*getFact(r));
            System.out.println("The result is "+res);
        }
        else System.out.println("r cannot be greater than n");
    
    }

    public static long getFact(int n)
    {
        long f=1;

        for(int i=n;i>=1;i--)
        {
        f*=i;
        }

    return f;
    }
}