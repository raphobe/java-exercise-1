package com.martinezmanor.fib;

public class FibCalc
{
    public int fibWorse(int x) 
    {
      if (x <= 2)
      {
        return 1;
      }
      else
      {
        return fib(x-1) + fib(x-2);
      }
    }

    public int fib(int x)
    {
         double sqrt5 = Math.pow(5, 0.5);

         double fibNumber = (alphaToPower(x) - betaToPower(x))/sqrt5;
         Integer fibNumberAsInt = (int)Math.round(fibNumber);
         return fibNumberAsInt;
    }

    private double alphaToPower(int x)
    {
      double alpha = 1.618003988;
      return Math.pow(alpha, x);
    }

    private double betaToPower(int x)
    {
      double beta = -0.618003988;
      return Math.pow(beta, x);
    }
}
