package its.Tables;

import javax.swing.table.AbstractTableModel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MultiplicationTableModel extends AbstractTableModel {

  private int noOfRows, noOfCols;
  public MultiplicationTableModel(int r, int c) {
    noOfRows = r;
    noOfCols = c;
  }

// Implementing the tree abstract methods:
  public int getColumnCount() {
    return(noOfRows);
  }

  public Object getValueAt(int r,int c) {
   return(new Integer(r*c));
  }

  public int getRowCount() {
    return(noOfRows);
  }

 // Overriding some methods:
  public Class getColumnClass(int c){
    return( getValueAt(0,c).getClass() );
  }

  public String getColumnName(int c){
    return("Col "+c);
  }
}