package com.JAVACSE1007.AdityaLabDA;
import java.util.Scanner;
                          //Name:- K Aditya
class Fab2 {              //reg.No:- 18BCE0130
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=sc.nextInt();
        int first=0,second=1,next;
        System.out.println("Fibonacci series is ");
        int i=0;
        while(i<n)
        {
            if(i<=1)
                next=i;
            else
            {
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next);
            i++;
        }
    }
}