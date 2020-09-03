package its.Images;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import javax.swing.JPanel;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImageCutAndMirrorFrame extends SimpleFrame {

  //Adjust the following path if neceassry
  private static final String picturePath ="./its/TestData/orange.png";
  private MediaTracker mediTracker;

  public ImageCutAndMirrorFrame() {
   this.setSize(600,610);
   Image im =  Toolkit.getDefaultToolkit().getImage(picturePath);
   CutAndMirrorPanel capp = new CutAndMirrorPanel(im);
   this.getContentPane().add(capp);
   int imageID = 1;
   mediTracker = new MediaTracker(this);
   mediTracker.addImage(im,imageID);
   try{
        mediTracker.waitForID(imageID);
      }
      catch (InterruptedException ex){
        System.out.println("Error loading  "+picturePath+".");
      }
  }
  public static void main(String[] args) {
    ImageCutAndMirrorFrame icamp = new ImageCutAndMirrorFrame();
    icamp.showIt("ImageCutAndMirrorFrame");
  }


 //internal class
  private class CutAndMirrorPanel extends JPanel{
    private Image im;

    CutAndMirrorPanel(Image i){
      im = i;
    }

    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(im,10,10,this);                            // (A)
      g.drawImage(im,420,10,50,400,this);                    // (B)
      g.drawImage(im,580,10,-100,400,this);                  // (C)
      g.drawImage(im,10,420,400,50,this);                    // (D)
      g.drawImage(im,10,580,400,-100,this);                  // (E)
      g.drawImage(im,420,420,580,580,250,130,290,150,this);  // (F)
      g.setColor(Color.white);
      g.drawRect(260,140,40,20);                             // (G)
    }
  }//internel class
}//class