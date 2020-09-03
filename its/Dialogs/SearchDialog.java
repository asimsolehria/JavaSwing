package its.Dialogs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class SearchDialog extends JDialog
{
  private JPanel mainPanel           = new JPanel();
  private JTextField searchTextField = new JTextField();
  private JRadioButton yesButton     = new JRadioButton("Yes");
  private JRadioButton noButton      = new JRadioButton("No");
  private JButton searchButton       = new JButton("Find");
  private JButton cancelButton       = new JButton("Cancel");
  private DataTransferObject dataTransfer;
  private ButtonGroup group = new ButtonGroup();

  public SearchDialog(Frame frame)
  {
    super(frame,"Search dialog",true);

    JLabel questionS    = new JLabel("search word:");
    JLabel questionCS   = new JLabel("case-sensitive?");
    JLabel filler       = new JLabel();

    this.getContentPane().setLayout(new BorderLayout());
    this.setLocation(300,300);
    this.getContentPane().add(mainPanel,BorderLayout.CENTER);

    mainPanel.setLayout(new GridLayout(4,2,10,0));
    mainPanel.add(questionS);
    mainPanel.add(questionCS);
    mainPanel.add(searchTextField);
    mainPanel.add(yesButton);
    mainPanel.add(filler);
    mainPanel.add(noButton);
    mainPanel.add(searchButton);
    mainPanel.add(cancelButton);

    group.add(yesButton);
    group.add(noButton);
    yesButton.setActionCommand("yesActionCommand");
    noButton.setActionCommand("noActionCommand");
    yesButton.setSelected(true);
    noButton.setSelected(false);

    SearchListener SLis = new SearchListener();
    searchButton.addActionListener(SLis);
    cancelButton.addActionListener(SLis);

    this.pack();
  }

  public void showIt(DataTransferObject dto)
  {
    dataTransfer =dto;
    this.setVisible(true);
  }

// Internal class
  class SearchListener implements ActionListener
  {
   // No constructor defined, default constructor is used

   public void actionPerformed(ActionEvent evt)
     {
       String searchText = searchTextField.getText();
       boolean caseSensitive =
        (group.getSelection().getActionCommand().equals("yesActionCommand"));
       String command = evt.getActionCommand();
       if(command.equals("Cancel"))
       {
        dataTransfer.setAll(searchText,caseSensitive,false);
        //Note that  setVisible  is a method of class SearchDialog,
        //not of the internal class SearchListener!
        setVisible(false);
       }
       else if (command.equals("Find"))
       {
        dataTransfer.setAll(searchText,caseSensitive,true);
        setVisible(false);
       }
     }
  }// internal class
}
