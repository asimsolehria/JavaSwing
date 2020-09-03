package its.Document;

import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.text.Position;
import javax.swing.JLabel;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DocListener implements DocumentListener
{
  private DocumentStatusPanel stausPanel;
  private Position pos1,pos2;


  public DocListener(DocumentStatusPanel stat,Position p1, Position p2)
  {
    stausPanel = stat;
    pos1 = p1;
    pos2 = p2;
  }
  public void insertUpdate(DocumentEvent e)
  {
    stausPanel.update("Operation "+e.getType().toString()
                      +": "+e.getLength()+" symbol(s) at offset "
                      +e.getOffset(),pos1.getOffset(),pos2.getOffset());
  }

  public void removeUpdate(DocumentEvent e)
  {
    stausPanel.update("Operation "+e.getType().toString()
                      +": "+e.getLength()+" symbol(s) at offset "
                      +e.getOffset(),pos1.getOffset(),pos2.getOffset());
  }

   public void changedUpdate(DocumentEvent e)
  {
    stausPanel.update("Operation "+e.getType().toString()
                      +": "+e.getLength()+" symbol(s) at offset "
                      +e.getOffset(),pos1.getOffset(),pos2.getOffset()); }
}