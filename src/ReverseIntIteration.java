import java.util.Scanner;

public class ReverseIntIteration {
    public int reverse(int x) {
        int x_orig = x;
        int rev = 0;
        while(x !=0){
            rev =(rev*10) + (x%10);
            x = x/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int Max = (int) Math.pow(2, 31)-1;
        System.out.print("x: " + x + " Max: " + Max);
    }
}
