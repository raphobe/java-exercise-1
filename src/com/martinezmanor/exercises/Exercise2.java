package com.martinezmanor.exercises;

import com.martinezmanor.refactor.FibOtherCalc;

public class Exercise2
{
    public static void main(String[] args)
    {
        FibOtherCalc calc  = new FibOtherCalc();

        for(int i = 1; i <= 7 ; ++i)
        {
            System.out.println("fib value for " + i + " is " + calc.fib(i));
        }
    }
}