package com.martinezmanor.fib;

import java.util.HashMap;
import java.util.Map;

public class FibCalc implements IFibCalc
{
  Map<Integer, Integer> fibCache = new HashMap<Integer, Integer>();
  
    public int fib(int x) 
    {
      if(x <=2 )
      { 
        return 1;
      }

      return fib(x-1) +fib(x-2);
    }

    public int fibBetter(int x)
    {
      double fibNumber = (alphaToPower(x) - betaToPower(x))/SQRT5;
      Integer fibNumberAsInt = (int)Math.round(fibNumber);
      return fibNumberAsInt;
    }

    private static final double SQRT5 = Math.pow(5, 0.5);
    private static final double ALPHA = (1 + SQRT5)/2;
    private static final double BETA = (1 - SQRT5)/2;
 
    private double alphaToPower(int x)
    {
      return Math.pow(ALPHA, x);
    }

    private double betaToPower(int x)
    {
      return Math.pow(BETA, x);
    }
}
