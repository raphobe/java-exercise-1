package com.martinezmanor.refactor;

import java.util.HashMap;
import java.util.Map;

import com.martinezmanor.fib.FibCalc;

public class FibOtherCalc extends FibCalc {
    
    Map<Integer, Integer> fibCache = new HashMap<Integer, Integer>();

    public int fib(int x)
    {
        return this.fibWorse(x);
    }
}