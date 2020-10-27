package CodeForces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int correctAns = 0;
        for(int i = 0; i < N; i++) {
            int P, V, T;
            P = sc.nextInt();
            V = sc.nextInt();
            T = sc.nextInt();
            int sum = P + V + T;
            if (sum >=2)
                correctAns++;
        }
        System.out.println(correctAns);
        sc.close();
    }
}
