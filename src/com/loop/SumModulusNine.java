package com.loop;

public class SumModulusNine
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 100; i <=200; i++)
        {
            if (i % 9 == 0)
            {
               sum = sum + i;
               System.out.println(i);
            }
        }
        System.out.println("the sum of all the numbers between 100 and 200 and divisible by 9 is " + sum);
    }
}
