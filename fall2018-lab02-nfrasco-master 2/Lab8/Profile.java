import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Profile {
  public static void main(String[] args) {
    
    //String str[] = {};         //get the whole file/input into this string;
    Scanner scanner = new Scanner(System.in);
    //int count = 0;
    //String name = scanner.nextline();
    ArrayList<String> list = new ArrayList<String>();
    while (scanner.hasNext()) {
      list.add(scanner.next());
    }
    
    //while (scanner.hasNext()){ 
    //  String str = str + (scanner.nextLine());
    //  count++;
    //}
        
     
    Map<String, Integer> map = new HashMap<String,Integer>();
    for (String s : list) {
      if (map.containsKey(s)) {
          map.put(s, map.get(s) + 1);
      } else {
          map.put(s, 1);
      }
    }
    for (Map.Entry <String, Integer> e : map.entrySet()) {
      System.out.println(e.getKey() + "=" + e.getValue());
    }
  }
  }

    