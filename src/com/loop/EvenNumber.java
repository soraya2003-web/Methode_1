package com.loop;

import java.io.PrintStream;

public class EvenNumber
{
    public static void main(String[] args)
    {
        for (int i=10; i<=30; i++ )
        {
            if ( i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
