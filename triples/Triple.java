package triples;
import java.util.*;


public class Triple{
  public static ArrayList<Integer>list = new ArrayList<Integer>();
  public static int x;
  public static int left;
  
  public static int leftSide(){
    x = 3;
    int n = 0;
    int i =0;
    while (x>2 && x<70){
      left= 8+2*(x-2);
    }
    x++;
    return left;
  }
  
  public static void main(String [] args){
    list.add(leftSide());
    for(int i =0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}

