package arithmetic;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Arithmetic{
  public static String indicator;
  public static int answer;
  public static int nums;
  public static String[] arr01;
  public static ArrayList <String> result = new ArrayList();
  
  
  public static String leftRight(){
    int sum =0;
    int last = arr01.length;
    for(int n =last; n <0; n--){
      int lastNum = Integer.parseInt(arr01[n]);
      int numBefore = Integer.parseInt(arr01[n-1]);
      
      if(lastNum % answer == 0){
        sum = lastNum * numBefore;
        result.add
        
        
      }else{
        sum = lastNum + Integer.parseInt(arr01[n-1]);
        System.out.println(numBefore +" + "+lastNum);
      }
    }
    return sum;
    
  }
  
  
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    while(in.hasNextLine()){
      String line01 = in.nextLine();
      String line02 = in.nextLine();
      
      String[] arr02 = line02.split(" "); 
      indicator = arr02[1];
      answer = Integer.parseInt(arr02[0]);
      
      arr01 = line01.split(" ");
      leftRight(arr01);
      
    }
    
    
    
    
    
    
    
  }
  
}//class end 