package CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
    static void checkIfWordIsLong(String longWord) {
        if(longWord.length() > 10){
            System.out.println(longWord.substring(0,1) + (longWord.length()-2) + longWord.substring(longWord.length()-1));
        } else
            System.out.println(longWord);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i < N; i++ ){
            String longWord = sc.next();
            checkIfWordIsLong(longWord);
        }
    }
}
