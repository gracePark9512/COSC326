package quilting;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Quilting extends JPanel{
  private static ArrayList<Square>squares = new ArrayList<Square>();
  private static boolean ready =false;
  public static int r,g,b;
  public static int xleft;
  public static int xright;
  public static int totalWid=0;
  public static double var;
 
  public void paintComponent(Graphics p){
    super.paintComponent(p);
    
    
    if(squares.size()>0){
      int width = (int)(200*squares.get(0).scale*var);
      int cent = 400;
      for(int id =0; id<squares.size(); id++){
      draw(p,cent-(width/2),cent-(width/2),width,0,id);
      
      }
    }
  }
  
  public static void draw(Graphics p, int x, int y, int width, int i,int id){ 
    if(i >= squares.size()) return;
    
    double scale = squares.get(i).scale;
    Color sqColor = new Color(squares.get(i).red, squares.get(i).green, squares.get(i).blue);
    
    p.setColor(sqColor);
    if(i==id){
    p.fillRect(x,y,width,width);
    }
    
    i++;
    double scale2=0.0;
    if(i < squares.size()){
      scale2 = squares.get(i).scale;
    }
    double scale1 = scale;
    width = (int)(200*scale2*var);
    
    draw(p,x-(width/2),y-(width/2), width,i,id);
    draw(p,(int)(x+(200*scale1*var)-(width/2)),y-(width/2),width,i,id);
    //botleft
    draw(p,(x-(width/2)),(int)(y+(200*scale1*var)-(width/2)),width,i,id);
    draw(p,(int)(x+(200*scale1*var)-(width/2)),(int)(y+(200*scale1*var)-(width/2)),width, i,id);      
   
  }
  
  
  public static void getSize( int x, int y, int width, int i){ 
    if(i >= squares.size()) return;
    
   
    double scale = 0.0;
    
    if(i<squares.size()){
      scale = squares.get(i).scale;
      totalWid += (int)(200*squares.get(i).scale);
    }
    
    i++;
    double scale2=0.0;
    if(i < squares.size()){
      scale2 = squares.get(i).scale;
    }
    double scale1 = scale;
    width = (int)(200*scale2);
    
    getSize(x-(width/2),y-(width/2), width,i);
        
   
  }
  
  
  public static void main(String[]args){
    JFrame frame = new JFrame("Quilting panel");
    Quilting panel = new Quilting(); 
    panel.setBackground(Color.white);
    frame.add(panel);
    frame.setSize(800,800);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Scanner in = new Scanner(System.in);
    while(in.hasNextLine()){
      String line = in.nextLine();
      String[] arr = line.split(" ");
      if(Double.parseDouble(arr[0]) != 0.0){
      Square nex = new Square(Double.parseDouble(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
      squares.add(nex);
      }
    }
    
    
    ArrayList<Double> scales = new ArrayList<Double>();
    for(int i=0; i < squares.size();i++){
      scales.add(squares.get(i).scale);

    }
    double min = scales.get(scales.indexOf(Collections.min(scales)));
    double calc = 1.0/min;
    for(int id = 0; id<scales.size(); id++){
      squares.get(id).scale = scales.get(id)*calc;
    }
    System.out.println(min);
    
    
    System.out.println(squares.size());
    int width = (int)(200*squares.get(0).scale);
    int cent = 400;
    if(squares.size()>0){
      getSize(cent-(width/2),cent-(width/2),width,0); 

       var = 700.0/totalWid;
       
    }

    panel.repaint();
    
  }
}
