import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    static String extractSecretMessage(String Str, String Sub) 
    { 
        Str = Str.replaceAll(Sub, " "); 
  
        Str = Str.trim(); 
  
        return Str; 
    } 
  
    public static void main(String args[]) 
    { 
        String Str = "LIELIEILIEAMLIECOOL"; 
        String Sub = "LIE"; 
        System.out.println(extractSecretMessage(Str, Sub)); 
    } 
} 