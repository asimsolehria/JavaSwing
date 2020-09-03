package its.Lists;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ListDemoFrame extends SimpleFrame {
  private String[] entries = {"Schleswig-Holstein", "Niedersachsen",
    "Hamburg", "Bremen", "Mecklenburg-Vorpommern", "Brandenburg",
    "Berlin", "Nordrhein-Westfalen","Hessen","Sachsen-Anhalt",
    "Rheinland-Pfalz","Th/*@ü@*/ringen","Sachsen","Saarland", "Bayern",
    "Baden-W/*@ü@*/rttemberg"};

  public ListDemoFrame() {
     JList provinces = new JList(entries);
     JScrollPane scrollPane = new  JScrollPane(provinces);
     this.getContentPane().add(scrollPane,BorderLayout.CENTER);
     this.pack();
  }

  public static void main(String[] args) {
    ListDemoFrame ldf = new ListDemoFrame();
    ldf.showIt("List demo");
  }
}
