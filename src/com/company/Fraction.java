package com.company;

public class Fraction {
    private int numerator, denominator;		//attributes

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

    public Fraction add(Fraction otherFrac)
    {
        int n = this.numerator * otherFrac.denominator + otherFrac.numerator * this.denominator;
        int d = this.denominator * otherFrac.getDenom();

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

    public String toString()
    {
        String s = this.numerator + "/";
        s += this.denominator;

        return s;
    }

    public Fraction reciprocal()
    {
        Fraction result = new Fraction(this.denominator, this.numerator);
        return result;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println(f1.toString() + " + " + f2.toString() + " = " + f3.toString());	// print the answer

		Fraction f4 = f1.subtract(f2);
		System.out.println(f1.toString() + " - " + f2.toString() + " = " + f4.toString());

        Fraction f5 = f1.multiply(f2);
        System.out.println(f1.toString() + " * " + f2.toString() + " = " + f5.toString());

        System.out.println("The reciprocal of " + f1.toString() + " is " + f1.reciprocal().toString());

        Fraction f6 = new Fraction(6, 34);
        Fraction f7 = new Fraction(12, 3);

        Fraction f8 = f6.add(f7);
        System.out.println(f6.toString() + " + " + f7.toString() + " = " + f8.toString());	// print the answer

    }
}
