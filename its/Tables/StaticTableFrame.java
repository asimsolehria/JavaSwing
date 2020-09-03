package its.Tables;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class StaticTableFrame extends SimpleFrame
{

  private String[][] entries  = {{"Cell 0.0","Cell 0.1","Cell 0.2"},
                                 {"Cell 1.0","Cell 1.1","Cell 1.2"}};
  private String[] columnNames = {"Column 0","Column 1","Column 2"};


  public StaticTableFrame()
  {
    JTable table = new JTable(entries,columnNames);
    JScrollPane scrollpane = new JScrollPane(table);
    this.getContentPane().add(scrollpane);
  }

  public static void main(String[] args)
  {
    StaticTableFrame STF = new StaticTableFrame();
    STF.showIt("Static Table Frame");
  }
}