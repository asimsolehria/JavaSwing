package its.Images;

import its.SimpleFrame.SimpleFrame;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class WebImageFrame extends SimpleFrame
{

  public WebImageFrame()
  {
    URL  picURL = null;
    JLabel pictureLabel = null;
    try
    {
      picURL = new URL("http://www.imm.dtu.dk/swingbook/HTMLTest/pear.png");
     }
    catch (Exception ex)
    {System.out.println("Problems in creating URL"+picURL.getPath());}
    if(picURL != null){
       ImageIcon picture = new ImageIcon(picURL);
       pictureLabel = new JLabel(picture);
    }
    else{
       pictureLabel = new JLabel("Image not loaded");
    }
    this.getContentPane().add(pictureLabel);
    pack();
  }

  public static void main(String[] args)
  {
    WebImageFrame wifr = new WebImageFrame();
    wifr.showIt("WebImageFrame: loading Image from the net");
  }
 }
