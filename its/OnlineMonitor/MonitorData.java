package its.OnlineMonitor;

import java.util.Vector;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MonitorData
{
  private Vector data;
  private double min,max;

  public MonitorData() {
    data = new Vector();
    min = Double.MAX_VALUE;
    max = Double.MIN_VALUE;
  }

  public void appendValue(double v){
    data.add(new Double(v));
    if(v < min){
      min = v;
    }
    if(v > max){
      max = v;
    }
  }

  public double getValueAt(int i){
    if(data.size() > 0){
      return(((Double)(data.get(i))).doubleValue());
    }
    else {
      return(-1.0);
    }
  }

  public int getNoOfData(){
    return(data.size());
  }

  public double getMin(){
    return(min);
  }

  public double getMax(){
    return(max);
  }
}