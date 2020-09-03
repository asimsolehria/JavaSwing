package its.Images;

import java.awt.*;
import javax.swing.JPanel;
import java.util.Vector;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImagePanel extends JPanel
{

  private Vector images;
  private int gap = 10;
  private MediaTracker mediTracker;
  private int imageID;

  public ImagePanel()
  {
   this.setLayout(new BorderLayout());
   this.setBackground(Color.yellow);
   images = new Vector();
   mediTracker = new MediaTracker(this);
   imageID = 0;
   this.setPreferredSize(new Dimension(1000,1400));
  }

  public void paintComponent(Graphics g)
  {
   super.paintComponent(g);
   int currentYPosition = gap;
   int currentXPosition = gap;
   int imageWidth, imageHeight;
   int maxHeight = -1;
   int panelWidth = this.getWidth();
   for (int i = 0; i < images.size(); i++) {
      Image currentImage = (Image)(images.get(i));
      imageWidth  = currentImage.getWidth(this);
      imageHeight = currentImage.getHeight(this);
      // Check, whether to start a new row.
      if((gap+imageWidth+currentXPosition) > panelWidth)
      {
        currentYPosition += maxHeight + gap;
        maxHeight = -1;
        currentXPosition = gap;
      }
      if (imageHeight > maxHeight)
      {
        maxHeight = imageHeight;
      }
      g.drawImage(currentImage,currentXPosition,currentYPosition,this);
      currentXPosition += gap + imageWidth;
   }//for i
 }

 public void addImage(String filename)
 {
   Image im = Toolkit.getDefaultToolkit().getImage(filename);
   images.add(im);
   repaint();
 }

public void addImageAndTrack(String filename)
 {
   Image im = Toolkit.getDefaultToolkit().getImage(filename);
   imageID++;
   mediTracker.addImage(im,imageID);
   try
      {
        // Wait for the image to be completely loaded.
        mediTracker.waitForID(imageID);
      }
      catch (InterruptedException ex){
        System.out.println("Error loading image "+filename+".");
      }
   images.add(im);
   repaint();
 }

 public void addImage(Image picture)
 {
   images.add(picture);
   repaint();
 }

}
