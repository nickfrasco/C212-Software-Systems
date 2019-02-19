import java.util.*;
import java.io.*;
import java.util.Set;

public class shortestPath{
  
  private HashMap<String, String[]> destination = new HashMap<String, String[]>();
  
  public int Path(String City_one, String City_two, int count){
    
    HashMap<String, Integer> number_one = new HashMap<String, Integer>();
    HashMap<String, Integer> number_two = new HashMap<String, Integer>();
    
  
    for (int y = 0; y < number_one.size(); y++) {
    String minHandle = null;
    
    int max = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    
    for(String handle: number_one.keySet()) {
      int value = number_one.get(handle);
      
      if(value < min)
       {min = value;
        minHandle = handle;}
    }
    
    for(String city: destination.keySet()){
      number_one.put(city,max);
    }
    
    
    number_two.put(minHandle, min);
    
    number_one.remove(minHandle);
    
      for (String x: number_one.keySet()) { //keySet to iterate
    	  
        if (number_one.get(x) > y+1);
        
          number_one.replace(x, y+1);
      }
    }
    
    System.out.println( "Number One:" + number_one + " " + "Number Two:" + number_two);
    
    return number_two.get(City_two);
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    
    shortestPath shortest_path = new shortestPath();
    Scanner list_of_cities = new Scanner(new File(args[0]));
    //
    while (list_of_cities.hasNext()) {
     
      String one_city = list_of_cities.nextLine(); 
      String[] split_city = one_city.split( "=" );
     

      System.out.println( split_city[0].trim() + " " + Arrays.toString(split_city[1].split(" ")));
      
      shortest_path.destination.put( split_city[0].trim() , split_city[1].split(" ") );  }
    
    
    
  }
}