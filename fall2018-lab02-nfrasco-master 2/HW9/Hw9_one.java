
import java.io.IOException;
import java.util.*;

public class Hw9_one {
  public static void main(String[] args) {
    Stack<String> s = new Stack<String>();
    String sentence = "Mary had a little lamb. It's fleece was white as snow.";
    Scanner in = new Scanner(sentence); 
    while (in.hasNext()) {
      String word = in.next(); 
      s.push( word ); 
      System.out.println( s ); 
    }
    String answer = ""; 
    while (! s.empty()) {
      String word = s.pop(); 
      answer = answer + " " + word; // word + " " + answer;
    }
    System.out.println( answer );
  }
}

