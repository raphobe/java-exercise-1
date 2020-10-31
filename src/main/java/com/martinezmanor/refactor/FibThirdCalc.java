package com.martinezmanor.refactor;

import com.martinezmanor.fib.FibCalc;
import com.martinezmanor.fib.IFibCalc;

public class FibThirdCalc implements IFibCalc {

    IFibCalc calc;
    public FibThirdCalc()
    {
        this.calc = new FibCalc();
    }
    @Override
    public int fib(int x) {
        return this.calc.fibBetter(x);
    }

    @Override
    public int fibBetter(int x) {
        return this.calc.fibBetter(x);
    }

}