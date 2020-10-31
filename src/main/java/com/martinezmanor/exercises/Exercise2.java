package com.martinezmanor.exercises;

import com.martinezmanor.fib.*;
import com.martinezmanor.refactor.*;

public class Exercise2
{
    public static void main(String[] args)
    {
        IFibCalc calc = new FibOtherCalc();
        for(int i = 1; i <= 7 ; ++i)
        {
            System.out.println("fib value for " + i + " is " + calc.fib(i));
        }
    }
}