public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (equals(other)){
      return 0;
    }
    if (getValue() > other.getValue()){
      return 1;
    }
    else{
      return -1;
    }
  }

  public boolean equals(Number other){
    if (getValue() == 0 || other.getValue() == 0){
      return (getValue() == 0 && other.getValue() == 0);
    }
    else if (Math.abs(other.getValue() - getValue()) / getValue() <= 0.00001){
      return true;
    }
    return false;
  }
}
