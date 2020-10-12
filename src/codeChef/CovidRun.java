//https://www.codechef.com/OCT20B/problems/CVDRUN

package codeChef;

import java.util.Scanner;

public class CovidRun {
    static class Node{
        int val;
        Node nextNode;
    };
    static Node addToEmpty(Node last, int data) {
        if(last != null)
            return last;
        Node temp = new Node();
        temp.val = data;
        last = temp;
        last.nextNode = temp;
        return last;
    }
    static Node addToEnd(Node last, int data){
        if(last == null) {
            return addToEmpty(last, data);
        }
        Node temp = new Node();
        temp.val = data;
        temp.nextNode = last.nextNode;
        last.nextNode = temp;
        last = temp;

        return last;
    }
    static void printList(Node last) {
        Node curr;
        if(last == null) {
            System.out.println("List is empty");
            return;
        }
        curr = last.nextNode;
        do{
            System.out.print(curr.val + " ");
            curr = curr.nextNode;
        } while (curr != last.nextNode);
        System.out.println();
    }
    static Node traverseNode(Node last, int interval){
        Node curr;
        if(last == null)
            return last;
        curr = last;
        for (int i = 0; i < interval; i++)
            curr = curr.nextNode;
        return curr;
    }
    private static boolean checkIfCityGetsInfected(Node last, int K, int X, int Y){
        Node curr;
        Node covidStart;
        if(last == null)
            return false;
        covidStart = traverseNode(last, X).nextNode;
        Node currentCity = traverseNode(last, Y).nextNode;
        curr = covidStart;
        do {
            curr = traverseNode(curr, K);
            if(curr == currentCity)
                return true;
        }while(covidStart != curr);
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N, K, X, Y;
            N = sc.nextInt();
            K = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
            Node last = null;
            for(int i =0; i < N; i++) {
                last = addToEnd(last, i);
            }

            boolean isInfected = checkIfCityGetsInfected(last, K, X, Y);
            System.out.println(isInfected ? "YES" : "NO");
        }
    }
}
