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
      return true;
    }
    else if (Math.abs(other.getValue() - value) / value <= 0.000001){
      return true;
    }
    return false;
  }

  
}
