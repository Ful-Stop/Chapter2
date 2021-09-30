package com.company;

public class Fraction {
    private int numerator, denominator;		//attributes

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction()
    {
        numerator = 1;
        denominator = 4;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator * other.denominator + this.denominator * other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction subtract(Fraction other)
    {
        int n = this.numerator * other.denominator - this.denominator * other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction multiply(Fraction other)
    {
        int n = this.numerator * other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public String toString();
    {
        String s = this.numerator + "/";
        s += this.denominator;

        return s;
    }

    public Fraction reciprocal()
    {
        Fraction result = new Fraction(d,n);
        return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println(toString(f1) " + " toString(f2) " = " + f3);	// print the answer

		/*
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);

		Add code to multiply f1 and f2 here

		Add code to call reciprocal here

		create 2 new fractions and add them here.

		*/


    }
}
