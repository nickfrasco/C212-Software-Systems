import java.util.ArrayList; 

public class OddListMagicSquare {
  public static void main(String[] args) {
    int[][] m = { {16, 3, 2, 13}, { 5, 10, 11, 8}, {9, 6, 7, 12}, { 4, 15, 14, 1} };
    ArrayList<ArrayList<Integer>> n; // declare n of type ArrayList<ArrayList<Integer>>
    n = new ArrayList<ArrayList<Integer>>(); // allocate an object of type ArrayList<ArrayList<Integer>>
    Object a; // declare a
    a = new Object(); // allocation 
    // declare and allocate a like you did for n just as an example 
    for (int i = 0; i < m.length; i++) { // go through all the lines 
      ArrayList<Integer> row; 
      row = new ArrayList<Integer>(); 
      for (int j = 0; j < m[i].length; j++) {
         row.add(m[i][j]);  
      }
      n.add(row); 
    }
    System.out.println( n ); 
    boolean test = OddListMagicSquare.isMagicSquare( m ); 
    System.out.println( "Is your matrix " + OddListMagicSquare.toString(m) + "a magic square? Answer: " + test ); 
    test = OddListMagicSquare.isMagicSquare( n ); 
    System.out.println( "Is your matrix " + OddListMagicSquare.toString(n) + "a magic square? Answer: " + test );
  }
  public static boolean isMagicSquare(ArrayList<ArrayList<Integer>> whatever) {
    /// same as above ... 
    return true; // so when we start all squares are magic   
  }
  public static boolean isMagicSquare(int[][] m) {
    // here calculate all the sums and make sure they're all the same
    // in a square of size n*n that number should be: n * (n * n + 1) / 2 
    // like in your example for size 4 this is: 4 * (16 + 1) / 2 so 34 (in 7.5)
    // that's the plan, but until then we just endorse any input 
    return true; // so when we start all squares are magic   
  }
  public static String toString(int[][] m) {
    String result = "\n";
    for (int row = 0; row < m.length; row++) {
      for (int col = 0; col < m[row].length; col++) {
         result = result + String.format( " %2d", m[row][col] );
         // also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
      }
      result = result + "\n"; 
    }
    return result; // + "\n";
  }
  public static String toString(ArrayList<ArrayList<Integer>> whatever) {
    String result = "\n";
    for (int row = 0; row < whatever.size(); row++) {
      for (int col = 0; col < whatever.get(row).size(); col++) {
         result = result + String.format( " %2d", whatever.get(row).get(col) );
         // also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
      }
      result = result + "\n"; 
    }
    return result; // + "\n";
  }
}