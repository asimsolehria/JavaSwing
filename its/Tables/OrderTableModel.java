package its.Tables;

import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class OrderTableModel extends AbstractTableModel
{
  private String[] columnNames = {"Product","Picture","Price",
                                   "Quantity","Total"};
  private String[] products    = {"Circle","Triangle","Rectangle"};
  private String[] imageName   = {"circ.png","tria.png","rect.png"};
  private int[] quantities     = {0,0,0};
  private double[] prices      = {10.00, 12.00, 12.50};
  private static final String Path = "./its/TestData/";
  public boolean[] bv= {true,false,true};

  public OrderTableModel()
  {
  }
  public int getColumnCount()
  {
    return(columnNames.length);
  }

  public int getRowCount()
  {
    return(products.length+1);
  }

   public String getColumnName(int c) {
       return(columnNames[c]);
    }

   public Class getColumnClass(int c) {
      return getValueAt(0, c).getClass();
   }

  public Object getValueAt(int r, int c)
  {
   Object result = new Object();
    if( r < products.length) {
     switch(c){
      case 0: result = products[r]; break;
      case 1: result = new ImageIcon(Path+imageName[r]);  break;
      case 2: result = new Double(prices[r]); break;
      case 3: result = new Integer(quantities[r]);   break;
      case 4: int quantity = ((Integer)getValueAt(r,3)).intValue();
              double price = ((Double)getValueAt(r,2)).doubleValue();
              result = new Double(quantity * price);  break;
     }//switch
    }
    else{
     switch(c){
      case 0: result = new String("SUM"); break;
      case 1: result = new Object();    break;
      case 2: result = new Double(0.0); break;
      case 3: result = new Integer(0);  break;
      case 4: double sum = 0.0;
              double ee;
              for (int i = 0; i < products.length; i++) {
                sum += ((Double)getValueAt(i,4)).doubleValue();
              }
              result = new Double(sum);  break;
     }
    }
    return(result);
  }

//cells in column 3 can be edited
   public boolean isCellEditable(int r, int c) {
        return(c == 3);
    }

   public void setValueAt(Object obj, int r, int c)
   {
     if(c == 3){
       quantities[r] = ((Integer)obj).intValue();
     }
        this.fireTableDataChanged();
   }

}