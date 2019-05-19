import java.util.*;


public class Identity{ 
  
  public static void main(String []args){
    double x = 1.01; 
    double y = 1.456; 
    double leftside; 
    double rightside;
    double leftside2;
    double rightside2;
    
    leftside = x;
    rightside = ((x/y)-(x*y))*y+(x*y*y);
    
    leftside2 =x;
    rightside2 = ((x/y)-(y*x))*y+(y*y*x);
    

    if(leftside == rightside){ 
      System.out.println("true"); 
    }else{ 
      System.out.println("false"); 
    } 
    System.out.println("Double left: "+ leftside);
    System.out.println("Double right: "+ rightside); 
    
    System.out.println("Double left2: "+ leftside2);
    System.out.println("Double right2: "+ rightside2); 
  }
  
} 