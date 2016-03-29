package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent e) {
      Point2D.Double p;
      double d;
      double w;
      p = toTurtlePos(e.getPoint());
      d = distance(p);
      w = towards(p);
      heading(w);
      forward(d);
      setStatusText("moving to "+p.toString());
      }
    });
  }
}

public class TurtleMouseObserverMain2 {
  public static void main(String[] args) {
    TurtleMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Release!");
  }
}