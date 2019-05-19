package rollin;
import java.util.*;

public class RollinApp extends Rollin{
   
  private static int count=0;
  
  RollinApp(int[] dice){
    super(dice);
  }
  
  public int handleRoll(int roll){
    count++;
    int[] subset = null;
    int[] subset2 = null;
    int[][] setOfIndices = null;
    int indiceToReturn = 0;
    for (int[][] si : setIndices) {
       
       
            if (isSet(si[0])) {
              setOfIndices = si;
              System.out.println(Arrays.toString(si[0])+Arrays.toString(si[1]));
              subset = si[1];
              subset2 = null;
              
              break;
            }
            
            
            if(isSet(si[1])){
              subset2 = si[0];
              subset = null;
              System.out.println(Arrays.toString(si[0])+Arrays.toString(si[1]));
              setOfIndices = si;
              break;
            }  
            else if(si[0][0] == 0 && si[0][1] == 4 && si[0][2] == 5){
            System.out.println("Did not find a set.");
            break;
            }
        
            
     }
    
 
         
//     int a = subset[0];
//     int b = subset[1];
//     int c = subset[2];
//     
//     if(a == b || a == c || b==c){
//       if(a == b){
//         indiceToReturn = 2;
//       }
//       else if(b==c){
//         indiceToReturn = 0;
//       }else{
//         indiceToReturn = 1;
//       }
//       
//       
//     }
//     
     
     
     return indiceToReturn;
        
  }
  
  public static void main(String[] args){
    
    
    int[] dice = {1,2,3,4,5,6};
    int i;
    Random rand = new Random();
    for( i=0; i < 6; i++){
      dice[i] = rand.nextInt(6)+1;
    }
    RollinApp a = new RollinApp(dice);
    System.out.println(Arrays.toString(a.dice));
    
    //while(!a.isComplete()){
      int roll;
      int dieIndice;
      roll = rand.nextInt(6)+1;
      dieIndice = a.handleRoll(roll);
      
      
    //}
    
  }
}
