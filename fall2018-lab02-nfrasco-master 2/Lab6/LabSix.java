import java.util.Arrays; 
import java.util.Scanner; 

class LabSix {
  public static void main(String[] args) {
    int[] numbers = new int[0]; 
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter: "); 
    String line = s.nextLine();     
    while (! line.equals("bye")) {
      int number = Integer.parseInt(line); 
      numbers = Arrays.copyOf(numbers, numbers.length+1); 
      numbers[numbers.length-1] = number;
      System.out.println(LabSix.toString(numbers)); 
      System.out.print("Enter: "); 
      line = s.nextLine();     
    }
    //System.out.println(LabSix.toString(numbers)); 
    //s.close();
    //Arrays.sort( numbers ); 
    //System.out.println(LabSix.toString(numbers)); 
    //s.close(); 
    LabSix.sort( numbers ); 
    System.out.println(LabSix.toString(numbers)); 
    s.close(); 
  }
  public static String toString(int[] a) {
    String result = "";
    for (int i = 0; i < a.length; i++)
      result = result + a[i] + ", ";
    if (a.length > 0)
      result = result.substring(0, result.length() - 2);
    return "[" + result + "]";
    
  }
  public static int[] copyOf(int[] a, int size) {
    int[] b = new int[size];
    for (int i = 0; i < size && i < a.length; i++){
      b[i] = a[i];
    }
    return b;
  }
  public static void sort(int[] a) {
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a.length - 1; j++)
      if (a[j] > a[j+1]) {
      int temp = a[j];
      a[j] = a[j+1];
      a[j+1] = temp;
    }
    }
  
  
}