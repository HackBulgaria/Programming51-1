import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Canvas extends JPanel implements Runnable {

  private final int WIDTH = 800;
  private final int HEIGHT = 800;
  private final int RADIUS = 100;
  private final int DELAY = 25;

  private Ellipse2D.Double circle;
  private Thread animator;
  private Graphics2D g2;
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g2 = (Graphics2D) g;
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
          RenderingHints.VALUE_ANTIALIAS_ON);
    g2.fill(circle);
    
    Toolkit.getDefaultToolkit().sync();
  }

  public Canvas() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setDoubleBuffered(true);
    circle = new Ellipse2D.Double(100, 100, RADIUS, RADIUS);

  }

  private void cycle() {
//    animation & collision detection happens here
    circle.x += 1;
    circle.y += 1;
  }

  @Override
  public void addNotify() {
    super.addNotify();

    animator = new Thread(this);
    animator.start();
  }

  @Override
  public void run() {

    long beforeTime, timeDiff, sleep;

    beforeTime = System.currentTimeMillis();

    while (true) {

      cycle();
      repaint();

      timeDiff = System.currentTimeMillis() - beforeTime;
      sleep = DELAY - timeDiff;

      if (sleep < 0) {
        sleep = 2;
      }

      try {
        System.out.println("Sleeping for " + sleep);
        Thread.sleep(sleep);
      } catch (InterruptedException e) {
        System.out.println("Interrupted: " + e.getMessage());
      }

      beforeTime = System.currentTimeMillis();
    }
  }
}

