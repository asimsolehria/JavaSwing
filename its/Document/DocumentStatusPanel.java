package its.Document;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DocumentStatusPanel extends JPanel
{

  private JTextArea info = new JTextArea();
  private JLabel pos1 = new JLabel("a ",JLabel.CENTER);
  private JLabel pos2 = new JLabel("b ",JLabel.CENTER);

  public DocumentStatusPanel()
  {
   this.setLayout(new BorderLayout());
   JScrollPane sp = new JScrollPane(info);
   info.setRows(10);
   this.add(sp,BorderLayout.CENTER);
   JPanel helpPanel = new JPanel();
   helpPanel.add(pos1);
   helpPanel.add(pos2);
   this.add(helpPanel,BorderLayout.SOUTH);
  }

  public void update(String s,int p1, int p2)
   {
     info.append(s+"\n");
     pos1.setText("Positions marker 1 = "+p1);
     pos2.setText("Positions marker 2 = "+p2);
   }
}