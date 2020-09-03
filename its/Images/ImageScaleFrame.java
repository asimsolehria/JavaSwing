package its.Images;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import javax.swing.*;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImageScaleFrame extends SimpleFrame {

  //Adjust the following path if neceassry
  private static final String picturePath ="./its/TestData/orange.png";
  private MediaTracker mediTracker;
  private int imageID = 0;

  public ImageScaleFrame() {
   this.setSize(800,600);
   ImagePanel ip  = new ImagePanel();
   JScrollPane sp = new JScrollPane(ip);
   sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
   sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   this.getContentPane().add(sp);
   mediTracker = new MediaTracker(this);

   Image original = loadImageAndTrack(picturePath);
   ip.addImage(original);
   Image klein    =  scaleImage(original,0.5);
   ip.addImage(klein);
   Image gross    =  scaleImage(original,2.0);
   ip.addImage(gross);
   repaint();
   }

 private Image scaleImage(Image im, double factor){
    imageID++;
    int newWidth  = (int)(im.getWidth(this)*factor);
    int newHeight = (int)(im.getWidth(this)*factor);

    Image scaledIm = im.getScaledInstance(newWidth,newHeight,Image.SCALE_FAST);

    mediTracker.addImage(scaledIm,imageID);
    try {
      mediTracker.waitForID(imageID);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
   return(scaledIm);
 }

 private Image loadImageAndTrack(String filename)
  {
   Image im = Toolkit.getDefaultToolkit().getImage(filename);
   imageID++;
   mediTracker.addImage(im,imageID);
   try
      {
        mediTracker.waitForID(imageID);
      }
      catch (InterruptedException ex){
        System.out.println("Error loading "+filename+".");
      }
    return(im);
  }

  public static void main(String[] args) {
    ImageScaleFrame isf = new ImageScaleFrame();
    isf.showIt("ImageScaleFrame: Scaled images");
  }
}