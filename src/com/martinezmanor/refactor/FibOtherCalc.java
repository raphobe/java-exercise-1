package com.martinezmanor.refactor;

import com.martinezmanor.fib.FibCalc;

public class FibOtherCalc extends FibCalc {

    public int fib(int x)
    {
        return this.fibBetter(x);
    }
}