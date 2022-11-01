import java.io.*;
import java.util.*;
class Square_sum {
    static int squaresum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }
 
    public static void main(String args[])
    {
        int n;
        System.out.println("enter the  number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(squaresum(n));
    }
}
 