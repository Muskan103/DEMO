package Recursion;
import java.util.*;
public class ArmStrong
{
    static int arm(int n)
    {
        if(n<10)
            return n*n*n;
        return (n%10)*(n%10)*(n*10)+arm(n/10);

    }

    public static void main(String[] args)
    {
        int num,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num=sc.nextInt();
        r=arm(num);
        if(num==r)
            System.out.println(num+" is an armstrong number");
        else
            System.out.println(num+"  is not armstrong number");
}
}