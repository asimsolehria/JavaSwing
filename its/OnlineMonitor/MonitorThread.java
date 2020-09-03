package its.OnlineMonitor;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.StringTokenizer;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MonitorThread extends Thread{

  private static final long delay = 5000;
  private String yahooDax =
      "http://de.finance.yahoo.com/d/quotes.csv?s=@^GDAXI&f=sl1d1t1c1ohgv&e=.csv";
  private MonitorPanel moniPane;
  private boolean goOn;

  public MonitorThread(MonitorPanel mp){
    moniPane = mp;
    goOn     = true;
  }

  public  void run(){
    while(goOn){
      getOneQuote(yahooDax);
      try {
        Thread.sleep(delay);
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }//try
    }//while
    System.out.println("Thread stopped");
  }

  public void stopThread(){
     goOn = false;
  }

  private double getOneQuote(String urlName)
   {
   URL urlToRead = null;
     try {
       urlToRead = new URL(urlName);
    }
    catch (Exception ex) {
         ex.printStackTrace();
    }
    try  { // Open the streams
       InputStreamReader inputReader = new InputStreamReader(urlToRead.openStream());
       BufferedReader urlReader = new BufferedReader(inputReader);
       String line =  urlReader.readLine();
       System.out.println(">"+line+"<");
       double quote = getQuoteFromString(line);
       moniPane.addData(quote);
     }catch(Exception e){System.out.println("Problem in URLReader");}
   return(1.0);
  }

private static double getQuoteFromString(String str){
         String quoteString;
         String euro,cent;
         StringTokenizer stok = new StringTokenizer(str,";");
         stok.nextToken(); // skip "^GDAXI"
         quoteString =  stok.nextToken(); // get quote as "eeee,cc"
         StringTokenizer stok2 = new StringTokenizer(quoteString,",\"");
         euro  = stok2.nextToken();
         cent = stok2.nextToken();
         int e = Integer.parseInt(euro);
         int c = Integer.parseInt(cent);

   return((double)e+(double)c/Math.pow(10,((double)(cent.length()))));

 }
}
