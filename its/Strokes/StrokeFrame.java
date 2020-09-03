package its.Strokes;

import its.SimpleFrame.SimpleFrame;

public class StrokeFrame extends SimpleFrame {

  public StrokeFrame() {
    StrokePanel strokePane = new StrokePanel();
    getContentPane().add(strokePane);
    pack();
  }

  public static void main(String[] args) {
    StrokeFrame sf = new StrokeFrame();
    sf.showIt("Stroke Frame");
  }
}