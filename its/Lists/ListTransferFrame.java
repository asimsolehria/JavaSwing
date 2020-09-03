package its.Lists;

import its.SimpleFrame.SimpleFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ListTransferFrame extends SimpleFrame
{
  private JList leftList, rightList;
  private DefaultListModel rightListModel;
  JButton transferButton;
  String[] entries = {"Schleswig-Holstein", "Niedersachsen", "Hamburg",
                      "Bremen", "Mecklenburg-Vorpommern", "Brandenburg", "Berlin",
                      "Nordrhein-Westfalen","Hessen","Sachsen-Anhalt",
                      "Rheinland-Pfalz","Th/*@ü@*/ringen","Sachsen","Saarland",
                      "Bayern","Baden-W/*@ü@*/rttemberg"};

  public ListTransferFrame()
  {
    this.setSize(400,300);
    leftList  = new JList(entries);

    rightListModel = new DefaultListModel();
    rightList = new JList(rightListModel);
    leftList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    TransferListener selLis = new TransferListener();
    leftList.addListSelectionListener(selLis);

    JPanel listPanel = new JPanel();
    listPanel.setLayout(new GridLayout(1,2));
    JScrollPane leftScrollPane  = new JScrollPane(leftList);
    JScrollPane rightScrollPane = new JScrollPane(rightList);
    listPanel.add(leftScrollPane);
    listPanel.add(rightScrollPane);
    this.getContentPane().add(listPanel,BorderLayout.CENTER);
  }

  public static void main(String[] args)
  {
    ListTransferFrame LLF = new ListTransferFrame();
    LLF.showIt("List Transfer Frame");
  }

//Listener as internal class
  class TransferListener implements ListSelectionListener{

    public TransferListener(){}

    public void valueChanged(ListSelectionEvent evt){
     if(!evt.getValueIsAdjusting())
     {
     String sel = (String)leftList.getSelectedValue();
     if(rightListModel.contains(sel))
      {
         rightListModel.removeElement(sel);
      }
     else
      {
         rightListModel.addElement(sel);
      }//ifelse
     }//if
   }//valueChanged

  }//internal class
}
