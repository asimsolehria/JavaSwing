package its.OnlineMonitor;

import java.io.InputStream;
import java.net.URL;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class ReadURL {

  private static String immURL =  "http://www.imm.dtu.dk/swingbook/HTMLTest/test1.html";

  public static void main(String[] args) {
    readAndPrintTheURL(immURL);
  }

  public static void readAndPrintTheURL(String urlName){
    // Create an URL
    URL urlToRead = null;
     try {
       urlToRead = new URL(urlName);
    }
    catch (Exception ex) {
         ex.printStackTrace();
    }
   // Read and the URL characterwise
   // and print it to the console.
    if(urlToRead != null){
     try  { // Streams öffnen
      InputStream inputStream = urlToRead.openStream();
      int c = inputStream.read();
      while (c != -1) {
        System.out.print((char)c);
         c = inputStream.read();
      }
      inputStream.close();
     }catch(Exception e){System.out.println("Problem reading from URL");}
   }
  }
}