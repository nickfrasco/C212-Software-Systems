import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

  public class one {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of rows: ");
    int row = sc.nextInt();
    System.out.println("Number of columns: ");
    int column = sc.nextInt();
    
    ArrayList<Integer> m;
    m = new Arraylist<Integer>();
    
    ArrayList<Integer> row1;
    row1 = new Arraylist<Integer>();
    
    ArrayList<Integer> column1;
    column1 = new Arraylist<Integer>();
    
    for (int i = column.length; i != 0; i--){
      Random rand = new Random();
      int r = rand.nextInt(50) + (-50);
      column[i] = r;
    }
    
    for (int i = row.length -1; i != 0; i--){
      Random rand = new Random();
      int r = rand.nextInt(50) + (-50);
      row[i] = r;
    }
    m.add(row);
    m.add(column);
    System.out.println(m);
  }
  }
  