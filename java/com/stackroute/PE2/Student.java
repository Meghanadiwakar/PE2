package com.stackroute.PE2;

import java.util.Scanner;

public class Student {
    public double AverageCalculation(int a[],int len)
    {
        double avg=0;

        for(int  i=0;i<len;i++)
        {
            avg=avg+a[i];
        }
        avg=avg/len;
        return avg;
    }

    public int getminimun(int a[],int len){
        int minValue = a[0];
        for(int i=1;i<len;i++){
            if(a[i] < minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }

    public int getmaximum(int a[],int len){
        int maxValue = a[0];
        for(int i=1;i<len;i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }



    public static void main(String args[])
    {
        int i = 0;

        System.out.println("Enter number of students");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] a=new int[n];

        System.out.println("Enter grades");



        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }


        Student c=new Student();

        System.out.print("Average is: " + c.AverageCalculation(a,n));
        System.out.print("Min is    : " + c.getminimun(a,n));
        System.out.print("Max is    : " + c.getmaximum(a,n));

    }
}




