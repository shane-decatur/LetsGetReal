public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public boolean equals(RealNumber other){
    if (value == 0 || other.getValue() == 0){
      return (value == 0 && other.getValue() == 0);
    }
    else if (Math.abs(other.getValue() - value) / value <= 0.00001){
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
    RealNumber sum = new RealNumber(value + other.getValue());
    return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(value * other.getValue());
    return product;
  }

  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(value / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(value - other.getValue());
    return difference;
  }
}
