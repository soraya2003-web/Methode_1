package com.loop;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        int n= 4;
        int number = n;
        int total = n;
        while (n>1)
        {
            total = total * (n-1);
            n--;
        }
        System.out.println("factorial of " + number + " is " + total);


    }
}
