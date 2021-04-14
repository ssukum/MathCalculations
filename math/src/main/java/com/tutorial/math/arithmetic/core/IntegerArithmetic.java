package com.tutorial.math.arithmetic.core;

import com.tutorial.math.MathX;
import com.tutorial.math.arithmetic.AbstractArithmetic;

/**
 * class which handles {@link Integer} arithmetic
 *
 * @since 1.0.0
 */
/* 
This is a singleton class for performing operations on Interger  
*/
public class IntegerArithmetic extends AbstractArithmetic<Integer> {
    // region singleton

    private static IntegerArithmetic instance;

    /**
     * @return default instance
     * @since 1.0.0
     */
    public static IntegerArithmetic getInstance() {
        if (instance == null) instance = new IntegerArithmetic();
        return instance;
    }

    // endregion

    // region fromInt, fromDouble and signum

    @Override
    public Integer fromInt(int a) {
        return a;
    }

    @Override
    public Integer fromDouble(double a) {
        return (int) a;
    }

    @Override
    public double signum(Integer a) {
        return Math.signum(a);
    }

    // endregion

    // region sum, difference, product, quotient and modulo

    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer difference(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer product(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer quotient(Integer a, Integer b) {
        return a / b;
    }

    @Override
    public Integer modulo(Integer a, Integer b) {
        return a % b;
    }

    // endregion

    // region power and root

    @Override
    public Integer power(Integer a, int b) {
        return Math.toIntExact((long) Math.pow(a, b));
    }

    @Override
    public Integer root(Integer a, int b) {
        return (int) MathX.root(a, b);
    }

    // endregion

    // region gcd

    @Override
    public Integer gcd(Integer a, Integer b) {
        return MathX.gcd(a, b);
    }

    // endregion
}
