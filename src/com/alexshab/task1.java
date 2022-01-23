package com.alexshab;

public class task1 {
    
    public static final double annualInterestRate = 0.18;
    public static final int numberOfRecalculations = 12;
    public static void main(String[] args) {

        compoundInterest(10000, 10);
        //double money = compoundInterest(10000,10 );
        //System.out.println(money);
    }

    public static double compoundInterest(int s, int t) {
        double a = 0;
        double tmp = Math.pow(1 + annualInterestRate / numberOfRecalculations, numberOfRecalculations * t);
        a = s * tmp;
        return a;
    }
}
