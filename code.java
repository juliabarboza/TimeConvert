import java.util.*; 
import java.io.*;

class Main {  
  public static String TimeConvert(int num) { 
  
    int fp = num /60;
    int sp = num % 60;
    
       
    return Integer.toString(fp) + ":" + Integer.toString(sp);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}
