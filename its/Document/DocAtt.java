package its.Document;

import java.awt.Color;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
class DocAtt{

  // This class just defines a number of attribute sets.

  public static SimpleAttributeSet greenText = new SimpleAttributeSet();
  public static SimpleAttributeSet redText = new SimpleAttributeSet();
  public static SimpleAttributeSet whiteOnBlackText = new SimpleAttributeSet();
  public static SimpleAttributeSet boldText = new SimpleAttributeSet();
  public static SimpleAttributeSet italicText = new SimpleAttributeSet();
  public static SimpleAttributeSet bigText = new SimpleAttributeSet();
  public static SimpleAttributeSet underlinedText = new SimpleAttributeSet();
  public static SimpleAttributeSet superscriptText = new SimpleAttributeSet();
  public static SimpleAttributeSet subscriptText = new SimpleAttributeSet();
  public static SimpleAttributeSet ugly = new SimpleAttributeSet();


  public static void createAttributes(){


    StyleConstants.setUnderline(underlinedText,true);

    StyleConstants.setForeground(greenText, Color.green);

    StyleConstants.setForeground(redText, Color.red);

    StyleConstants.setForeground(whiteOnBlackText, Color.white);
    StyleConstants.setBackground(whiteOnBlackText, Color.black);

    StyleConstants.setBold(boldText,true);

    StyleConstants.setItalic(italicText,true);

    StyleConstants.setFontSize(bigText,24);

    StyleConstants.setSuperscript(superscriptText,true);

    StyleConstants.setSubscript(subscriptText,true);

    StyleConstants.setForeground(ugly, Color.yellow);
    StyleConstants.setBackground(ugly, Color.red);
    StyleConstants.setItalic(ugly, true);
 }
}
