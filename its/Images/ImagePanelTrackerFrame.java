package its.Images;

import java.awt.BorderLayout;
import its.SimpleFrame.SimpleFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ImagePanelTrackerFrame extends SimpleFrame
{
  private final String picturePath  = "./its/TestData/";

  public ImagePanelTrackerFrame()
  {
    this.setSize(600,600);
    ImagePanel ip = new ImagePanel();
    this.getContentPane().add(ip,BorderLayout.CENTER);
      ip.addImageAndTrack(picturePath+"strawberry.png");
      ip.addImageAndTrack(picturePath+"banana.png");
      ip.addImageAndTrack(picturePath+"lime.png");
      ip.addImageAndTrack(picturePath+"plum.png");
      ip.addImageAndTrack(picturePath+"lemon.png");
      ip.addImageAndTrack(picturePath+"apple.png");
      ip.addImageAndTrack(picturePath+"grapes.png");
  }
  public static void main(String[] args)
  {
    ImagePanelTrackerFrame ipf = new ImagePanelTrackerFrame();
    ipf.showIt("Loading Images");
  }
}

