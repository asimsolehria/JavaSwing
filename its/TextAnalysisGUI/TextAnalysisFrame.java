package its.TextAnalysisGUI;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import javax.swing.JButton;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextAnalysisFrame  extends SimpleFrame
{
  public TextAnalysisFrame()
  {
    this.setSize(300,150);
    TextAnalysisPanel taPanel = new TextAnalysisPanel();
    this.getContentPane().add(taPanel,BorderLayout.CENTER);
    JButton analyseButton = new JButton("Analyse");
    analyseButton.setBackground(Color.blue);
    analyseButton.setForeground(Color.yellow);
    this.getContentPane().add(analyseButton,BorderLayout.SOUTH);

    TextAnalysisListener taList = new TextAnalysisListener(taPanel);

    analyseButton.addActionListener(taList);
    }

}