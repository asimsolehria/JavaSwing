package its.Images;

import its.SimpleFrame.SimpleFrame;
import javax.swing.*;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImageFrame extends SimpleFrame
{

  private ImageIcon picture;
  //Adjustthe following path if neceassry
  private final String picturePath  = "./its/TestData/";
  private final String imageFileName = "orange.png";

  public ImageFrame()
  {
    picture = new ImageIcon(picturePath+imageFileName);
    JLabel pictureLabel = new JLabel(picture);
    this.getContentPane().add(pictureLabel);
    pack();
  }

  public static void main(String[] args)
  {
    ImageFrame imfr = new ImageFrame();
    imfr.showIt("ImageFrame: loading image from a file");
  }
}