 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class space {
  static String getAlphaNumericString(int n)
  {
  // public static String gen(){
   // choose a Character random from this String
   String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
  
   // create StringBuffer size of AlphaNumericString
   StringBuilder sb = new StringBuilder(n);
  
   for (int i = 0; i < n; i++) {
  
    // generate a random number between
    // 0 to AlphaNumericString variable length
    int index= (int)(AlphaNumericString.length()* Math.random());
  
    // add Character one by one in end of sb
    sb.append(AlphaNumericString.charAt(index));
   }
  
   return sb.toString();
 }
  

 
 public static void main(String[] args) throws AWTException , InterruptedException{
   
   System.out.println("program is running please open your edge browser");
   Robot robot = new Robot();
     
       int j;
       int size=37;
       for( j=1;j<=37;j++){
          //String Text = null;
         Thread.sleep(5000);
        for (int i = 0; i < size; i++) {
          //int n = 20;
           String Text = getAlphaNumericString(10);
           System.out.println( i +" " +Text); 

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        
        Thread.sleep(5000);
        
        
        
        
        //pressing key 
             robot.keyPress(KeyEvent.VK_CONTROL);
             
             robot.keyPress(KeyEvent.VK_E);

             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_V);
          
             robot.keyPress(KeyEvent.VK_ENTER);


             //releasing key 
             robot.keyRelease(KeyEvent.VK_CONTROL);
             robot.keyRelease(KeyEvent.VK_E);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             robot.keyRelease(KeyEvent.VK_V);
             // robot.keyRelease(KeyEvent.VK_BACK_SPACE);
             robot.keyRelease(KeyEvent.VK_ENTER);
            }
        }

           Thread.sleep(2000);
        }
    


      
    }

    
