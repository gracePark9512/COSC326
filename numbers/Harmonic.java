package numbers;
import  java.io.*;


public class Harmonic{
  public static void harmonicFloat(int n){
    int i;
    float sum=0;
    //input
  
    
    for(i=1;i<=n;i++)
    {
      sum=sum+(float)1/i;
    }
    System.out.println("FLOAT "+sum);
  }
  
   public static void harmonicDouble(int n){
    int i;
    double sum=0;
    //input
    
    for(i=1;i<=n;i++)
    {
      sum=sum+(double)1/i;
    }
    System.out.println("DOUBLE "+sum);
  }
  
  
  public static void harmonicFloatReverse(int n){
    int i;
    float sum=0;
    //input
  
    
    for(i=n;i>0;i--)
    {
      sum=sum+(float)1/i;
    }
    System.out.println("FLOATR "+sum);
  }
  
   public static void harmonicDoubleReverse(int n){
    int i;
    double sum=0;
    //input
    
    for(i=n;i>0;i--)
    {
      sum=sum+(double)1/i;
    }
    System.out.println("DOUBLER "+sum);
  }
  
  
  
  
  public static void main(String[] arg)
  {
    int n = 10000;
    harmonicFloat(n); 
    harmonicDouble(n);
    System.out.println("9.787606036044382264178477904851605334859262945577691718389");
    System.out.println("\nReverse");
    harmonicFloatReverse(n);
    harmonicDoubleReverse(n);
    
    System.out.println( "9.787606036044382264178477904851605334859262945577691718389");
    
  } 
}