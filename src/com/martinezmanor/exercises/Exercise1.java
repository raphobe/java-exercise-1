package com.martinezmanor.exercises;

import com.martinezmanor.fib.FibCalc;

public class Exercise1
{
    public static void main(String[] args)
    {
        FibCalc cal = new FibCalc();
        for(int i = 1; i <= 7 ; ++i)
        {
            System.out.println("fib value for " + i + " is " + cal.fib(i));
        }
    }
}