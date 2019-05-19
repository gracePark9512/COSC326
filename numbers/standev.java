import java.util.*;
public class standev{
  private static double[] numbers; 
  private static float[] floatnumbers;
  private static double mean;
  private static float floatmean;
  private static int arrLength = 20;
  
  public static void main(String[] args){ 
    Random rand = new Random(); 
    numbers = new double[20];
    floatnumbers = new float[arrLength];
    
    
    for(int i = 0; i < numbers.length; i++){ //finding the mean for the first std dev 
      numbers[i] = rand.nextDouble();
      //numbers[i] = numbers[i] 4;   //for the second question, add a constant 
      mean += numbers[i]; 
    }
    mean = mean/(numbers.length); 
    for(int i = 0; i < numbers.length; i++){ //find the mean for the float 
      floatnumbers[i] = (float)numbers[i];
      ///float floatnumbers[i] = 0 + rand.nextFloat() * (100 - 0);
      floatmean = floatmean + floatnumbers[i]; 
      //System.out.println("FM "+floatnumbers[i]); 
      
    }
      floatmean = floatmean/(float)arrLength;
  
      
      System.out.println(Arrays.toString(floatnumbers)); 
      System.out.println(Arrays.toString(numbers));
      System.out.println(popfloat() + " FLOAT SDEV");
      System.out.println(popfloat2() + " FLOAT SDEV 2"); 
      System.out.println(population() + " DOUBLE STDEV"); 
      System.out.println(population2() + " DOUBLE STDEV 2");
  }
  
  public static double population(){ //standard deviation first equation double precision
    double finalnum = 0.0;
    for(int i = 0; i < numbers.length; i++){
     finalnum =  finalnum += Math.abs(Math.pow((mean - numbers[i]),2)); 
    }
     //finalnum = Math.pow(Math.abs(finalnum), 2); 
     finalnum = (finalnum)/(numbers.length); 
     finalnum = Math.sqrt(finalnum);
    return finalnum;
  }
    
   
  public static double popfloat(){ //standard deviation first equation single precision
    //float finalnum = 0.0f;
    //float newmean = 0.0f;
    float sum=0;
    for(int i = 0; i < floatnumbers.length; i++){
     //newmean = (float) mean; 
     sum = sum+ Math.abs((floatnumbers[i]-floatmean)*(floatnumbers[i]-floatmean)); 
    }
 
     float variance = (sum)/arrLength; 
     float stdev = (float) Math.sqrt(variance);
     
    
    return stdev;
  }
  
   
  public static double popfloat2(){ //st dev for second equation (not requiring precomputation)
    float stdev = 0; 
    //double[] numsq; 
    float temp = 0;
    float sq = 0;
    
    float numberssq = (floatsigma(floatnumbers)) * (floatsigma(floatnumbers)); 
    for(int i =0; i < floatnumbers.length; i++){ 
      sq += (floatnumbers[i] * floatnumbers[i]); 
    }

    temp = Math.abs(sq - (numberssq/floatnumbers.length));

    stdev = (float) Math.sqrt(temp/floatnumbers.length); 
    
    return stdev;
  }
  
  public static double population2(){ //st dev for second equation (not requiring precomputation)
    double stdev = 0.0; 
    //double[] numsq; 
    double temp = 0.0;
    double sq = 0.0;
    double numberssq = (Math.pow(sigma(numbers), 2)); 
    for(int i =0; i < numbers.length; i++){ 
      sq += Math.pow(numbers[i], 2); 
    }
      
    //System.out.println(numberssq + " 2nd part"); 
    temp = Math.abs(sq - (numberssq/numbers.length));
   // System.out.println(temp);
    stdev = Math.sqrt(temp/numbers.length); 
    
    return stdev;
  }
  
  public static double sigma(double[] array){ 
    double sum = 0.0; 
    for(int i = 0; i < array.length; i++){ 
      sum += array[i]; 
    } 
    return sum;
  }
    public static float floatsigma(float[] array){ 
    float sum = 0; 
    for(int i = 0; i < array.length; i++){ 
      sum += array[i]; 
    } 
    return sum;
  }  
    
}
    