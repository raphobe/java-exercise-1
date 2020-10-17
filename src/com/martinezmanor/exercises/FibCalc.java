package com.martinezmanor.exercises;


public class FibCalc
{
    public int fib(int x) 
    {
      if (x <= 2)
      {return 1;}
      else{
          return fib(x-1) + fib(x-2);

      }
    }

    public double fibBetter(double x)
    {
         double alpha = 1.618003988;
         double beta = -0.618003988;

         return Math.round((Math.pow(alpha, x) - Math.pow(beta, x))/Math.pow(5,0.5));

    }

    public static void main(String[] args)
    {
        FibCalc calc = new FibCalc();
        System.out.println(calc.fib(8));
        System.out.println(calc.fibBetter(8.0));
   
    }
 
}
