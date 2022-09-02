package gui;

public class CommonCode {
    public static void onlyDigitAllowed(java.awt.event.KeyEvent evt){
     //can not enter other then Digits
     char c=evt.getKeyChar();
     if(!Character.isDigit(c)){
         evt.consume();
     }
    }
public static void onlyAlphabetAllowed(java.awt.event.KeyEvent evt){    
    //can not enter other than alphabets and space
    char c=evt.getKeyChar();
     if((!Character.isAlphabetic(c)) && !(c==' ') ) {
        evt.consume(); 
     } 
  }
} 

