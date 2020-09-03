package its.TextAnalysisGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextAnalysisListener implements ActionListener
{
  private TextAnalysisPanel taPanel;

  public TextAnalysisListener(TextAnalysisPanel t)
  {
   taPanel = t;
  }

  public void actionPerformed(ActionEvent evt)
  {
         taPanel.startAnalysisAndDisplayResult();
  }
}