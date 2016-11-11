package ex1.acoperire;

//we will use a class that holds the margins of intervals

class Interval implements Comparable<Interval> {
    private int a;
    private int b;

    public Interval(int x, int y){
        a = x;
        b = y;
    }

    public int getA() {
      return a;
    }
    public int getB() {
      return b;
    }

    //we will sort by the right margin (b)
    public int compareTo(Interval other) {
      if (this.getB() == other.getB()) return 0;
      else 
          if (this.getB() > other.getB()) return 1;
          else return -1;    
    }
    
    public String toString(){
        return "(" + Integer.toString(a) + ", " + Integer.toString(b) + ")\n";
    }
  } 


