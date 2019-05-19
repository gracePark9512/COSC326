package quilting;


public class Square{
  int red;
  int green;
  int blue;
  double scale;
  
  
  public Square(double scale, int red,int green,int blue){
  this.red = red;
  this.green = green;
  this.blue = blue;
  this.scale = scale;
  }
  
  public String toString(){
    return scale+" "+red+" "+green+" "+blue;
  }

}