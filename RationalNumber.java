public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0 || nume == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      numerator = -nume;
      denominator = -deno;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber(denominator, numerator);
    return reciprocal;
  }

  public boolean equals(RationalNumber other){
    if (numerator == other.getNumerator() && denominator == other.getDenominator()){
      return true;
    }
    return false;
  }

  public String toString(){
    if (denominator == 1){
      return numerator+"";
    }
    return numerator+"/"+denominator;
  }

  public static int gcd(int a, int b){
    if (a == 0 || b == 0){
      return 1;
    }
    int divisor = 1;
    if (a > b){
      while (a % b != 0){
        int r = a % b;
        a = b;
        b = r;
      }
      return b;
    }
    else {
      while (b % a != 0){
        int r = b % a;
        b = a;
        a = r;
      }
      return Math.abs(a);
    }
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    int nume = numerator * other.getNumerator();
    int deno = denominator * other.getDenominator();
    RationalNumber product = new RationalNumber(nume, deno);
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    int nume = numerator * other.getDenominator();
    int deno = denominator * other.getNumerator();
    RationalNumber quotient = new RationalNumber(nume, deno);
    return quotient;
  }

  public RationalNumber add(RationalNumber other){
    int nume = numerator * other.getDenominator() + other.getNumerator() * denominator;
    int deno = denominator * other.getDenominator();
    RationalNumber sum = new RationalNumber(nume, deno);
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    int nume = numerator * other.getDenominator() - other.getNumerator() * denominator;
    int deno = denominator * other.getDenominator();
    RationalNumber difference = new RationalNumber(nume, deno);
    return difference;
  }
}
