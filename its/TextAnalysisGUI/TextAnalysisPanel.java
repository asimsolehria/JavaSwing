package its.TextAnalysisGUI;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextAnalysisPanel extends JPanel
{
  private JLabel lastTextLabel;
  private JLabel numberOfEsLabel;
  private JLabel numberOfTextsLabel;
  private JTextField inputField;
  private TextAnalysisModel analysisModel;

  public TextAnalysisPanel()
  {
    analysisModel = new TextAnalysisModel();

    this.setBackground(Color.yellow);
    this.setLayout(new GridLayout(3,2,10,10));
    JLabel questionLabel   = new JLabel("Enter text:");
    JLabel replyLabel      = new JLabel("Current text:");
    JLabel numberTextLabel = new JLabel("No. of Es in current text:");
    lastTextLabel          = new JLabel("");
    numberOfEsLabel        = new JLabel("--");
    inputField             = new JTextField("");

    questionLabel.setOpaque(true);
    questionLabel.setBackground(Color.black);
    questionLabel.setForeground(Color.white);

    replyLabel.setOpaque(true);
    replyLabel.setBackground(Color.black);
    replyLabel.setForeground(Color.white);

    numberTextLabel.setOpaque(true);
    numberTextLabel.setBackground(Color.black);
    numberTextLabel.setForeground(Color.white);

    numberOfEsLabel.setOpaque(true);
    numberOfEsLabel.setBackground(Color.red);
    numberOfEsLabel.setForeground(Color.white);

    lastTextLabel.setOpaque(true);
    lastTextLabel.setBackground(Color.red);
    lastTextLabel.setForeground(Color.white);

    this.add(questionLabel);
    this.add(inputField);
    this.add(replyLabel);
    this.add(lastTextLabel);
    this.add(numberTextLabel);
    this.add(numberOfEsLabel);
  }

  public void startAnalysisAndDisplayResult()
   {
     String text = inputField.getText();
     analysisModel.analyse(text);
     lastTextLabel.setText(analysisModel.getCurrentText());
     int noOfEs = analysisModel.getCurrentNumberOfEs();
     numberOfEsLabel.setText(Integer.toString(noOfEs));
     inputField.setText("");
   }

}