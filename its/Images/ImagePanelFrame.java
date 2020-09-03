package its.Images;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImagePanelFrame extends SimpleFrame
{
  //Adjust the following path if neceassry
 private final String picturePath  = "./its/TestData/";

 public ImagePanelFrame()
  {
    this.setSize(900,600);
    ImagePanel ip = new ImagePanel();
    this.getContentPane().add(ip,BorderLayout.CENTER);
    ip.addImage(picturePath+"strawberry.png");
    ip.addImage(picturePath+"banana.png");
    ip.addImage(picturePath+"lime.png");
    ip.addImage(picturePath+"plum.png");
    ip.addImage(picturePath+"lemon.png");
    ip.addImage(picturePath+"apple.png");
    ip.addImage(picturePath+"grapes.png");
   }
  public static void main(String[] args)
  {
    ImagePanelFrame ipf = new ImagePanelFrame();
    ipf.showIt("Loading Images");
  }


}