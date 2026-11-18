package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(new Main().add(m,n));
        System.out.println(new Main().sub(m,n));
        System.out.println(new Main().mul(m,n));
        System.out.println(new Main().div(m,n));
        sc.close();
    }
}