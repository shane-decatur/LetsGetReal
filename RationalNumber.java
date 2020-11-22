public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
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
    return numerator+"/"+denominator;
  }

  public static int gcd(int a, int b){
    if (a == 0 || b == 0){
      return 1;
    }
    int divisor = 1;
    if (a > b){
      int r = a % b;
      int dividend = b;
      while (r != 0){
        divisor = r;
        r = dividend % divisor;
        dividend = divisor;
      }
    }
    else if (b > a){
      int r = b % a;
      int dividend = a;
      while (r != 0){
        divisor = r;
        r = dividend % divisor;
        dividend = divisor;
      }
    }
    return divisor;
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }
}
