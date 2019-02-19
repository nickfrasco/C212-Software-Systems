class Table {
  
  private int[][] values; 

  Table(int size) {
    this.values = new int[size][size]; 
  }
  
  public String toString() {
    String result = "\n";
    for (int row = 0; row < values.length; row++) {
      for (int col = 0; col < values[row].length; col++) {
        result = result + String.format( " %1d", values[row][col] );
        // also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
      }
      result = result + "\n"; 
    }
    return result; // + "\n";
  }
  
  public void reset() {
    for (int row = 0; row < values.length; row++) {
      for (int col = 0; col < values[row].length; col++) {
        this.values[row][col] = (int)(Math.random() * 3);  
      }
    }
  }
  
  public double neighborAverage(int i, int j, int n) {
    double sum = 0, count = 0; 
    for (int row = i - n; row <= i + n; row++) {
      for (int col = j - n; col <= j + n; col++) {
        if (row < 0 || row >= this.values.length ||
            col < 0 || col >= this.values.length || 
            row == i && col == j ) { 
          
        } else { 
          sum += this.values[row][col]; 
          count += 1;  
        }
        
      }
    }
    return sum / count;
  }
  
  public static void main(String[] args) {
    Table a = new Table(10); 
    System.out.println(a); 
    a.reset(); 
    System.out.println(a); 
    System.out.print(a.neighborAverage(0, 0, 1) + " is the same as " ); // (a[0][1] + a[1][1] + a[1][0])/3
    System.out.println ((a.values[0][1] + a.values[1][1] + a.values[1][0])/3.0);
    
    System.out.print(a.neighborAverage(0, 0, 2) + " is the same as " ); 
    System.out.println ((                 a.values[0][1] + a.values[0][2] + 
                         a.values[1][0] + a.values[1][1] + a.values[1][2] + 
                         a.values[2][0] + a.values[2][1] + a.values[2][2]) /8.0);
  }
  
}