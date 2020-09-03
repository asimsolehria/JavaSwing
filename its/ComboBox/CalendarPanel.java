package its.ComboBox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CalendarPanel extends JPanel {
  private String[] months = {"January","February","March","April",
                             "May","June","July","August",
                             "September","October","November","December"};
  private JComboBox yearBox  = new JComboBox();
  private JComboBox monthBox = new JComboBox(months);
  private JComboBox dayBox   = new JComboBox();
  private JLabel yearLabel    = new JLabel("Year ");
  private JLabel monthLabel   = new JLabel("Month ");
  private JLabel dayLabel     = new JLabel("Day ");
  private JLabel dummy        = new JLabel("");
  private int startyear;
  private int endyear;

  public CalendarPanel() {
    this.setLayout(new GridLayout(4,2));
    startyear = 2004;
    endyear   = 2007;
    initBoxes();
    this.add(dayLabel);
    this.add(dayBox);
    this.add(monthLabel);
    this.add(monthBox);
    this.add(yearLabel);
    this.add(yearBox);
    this.add(dummy);

    yearBox.setEditable(true);
    CalenderListener cList = new CalenderListener();
    yearBox.setActionCommand("YearChanged");
    yearBox.addActionListener(cList);
    monthBox.setActionCommand("MonthChanged");
    monthBox.addActionListener(cList);
  }

  private void initBoxes()
  {
    for (int y=startyear;y <= endyear;y++ )
    {
      yearBox.addItem(Integer.toString(y));
    }//for
    for (int d=1;d<=31 ;d++ )
    {
      dayBox.addItem(Integer.toString(d));
    }//for
    monthBox.setMaximumRowCount(12);
    dayBox.setMaximumRowCount(10);
    yearBox.setMaximumRowCount(4);
  }

  private void  setDayListTo(int desiredLength){
    int currentLength = dayBox.getItemCount();
    if(currentLength < desiredLength){
      for (int i = currentLength+1; i <= desiredLength; i++) {
        dayBox.addItem(Integer.toString(i));
      }//for i
     }
    else if (currentLength > desiredLength)
    {
      for (int i = currentLength-1; i >= desiredLength; i--) {
        dayBox.removeItemAt(i);
      }//for i
    }
  }

 public String getDate(){
  return((String)dayBox.getSelectedItem()+"."+
         (String)monthBox.getSelectedItem()+" "+
         (String)yearBox.getSelectedItem());
 }

 class CalenderListener implements ActionListener
 {
   public void actionPerformed(ActionEvent evt){
   String actionCommand =  evt.getActionCommand();
   int year  = Integer.parseInt(((String)yearBox.getSelectedItem()).trim());
   int month = monthBox.getSelectedIndex();
   if((year > 2099) || (year < 1901)){
     year = 2000;
     yearBox.setSelectedItem("2000");
   }
   if(actionCommand.equals("YearChanged"))
   {
      if((year % 4 == 0) && (month == 1)){
       setDayListTo(29);
     }
   }
   else if(actionCommand.equals("MonthChanged"))
   {
     if((month == 0) || (month == 2) || (month == 4) || (month == 6) ||
        (month == 7) || (month == 9) || (month == 11)){
            setDayListTo(31);
          }
      else if(month == 1){
         if(year % 4 == 0){
           setDayListTo(29);
          }
          else
          {
            setDayListTo(28);
          }//ifelse
      }//ifelse
     else{
       setDayListTo(30);
      }//ifelse
   }//ifelse
  }//actionPerformed
 }//internal class
}