package codeChef;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
        static BigInteger solve(int N)
        {
            BigInteger bi = BigInteger.ONE;
            for(int i =2; i <=N; i++)
                bi = bi.multiply(BigInteger.valueOf(i));
            return bi;
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T-->0)
            {
                int N = sc.nextInt();

                System.out.println(solve(N));
            }
        }
}
