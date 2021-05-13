package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int a =   recursion(64,400);
        System.out.println(a);
    }
    public static int recursion(int a , int b){
        if(a < b){
            int aux = a;
            a = b;
            b = aux;
        }
        if (a % b == 0)
            return b;
        else {
            int r = a % b;
            return recursion(b,r);
        }
    }
}
