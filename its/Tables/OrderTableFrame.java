package its.Tables;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class OrderTableFrame extends SimpleFrame
{

  public OrderTableFrame()
  {
    this.setSize(300,250);
    OrderTableModel otmodel = new OrderTableModel();
    JTable JTab = new JTable(otmodel);
    JTab.setRowHeight(50);

    JScrollPane SP = new JScrollPane(JTab);
    this.getContentPane().add(SP);

  }

  public static void main(String[] args)
  {
    OrderTableFrame otframe = new OrderTableFrame();
    otframe.showIt();
  }
}