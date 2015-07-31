package BouncingBall;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Canvas extends JPanel implements Runnable {

  private final int WIDTH = 600;
  private final int HEIGHT = 600;
  private final int RADIUS = 100;
  private double mainSpeedX = 1;
  private double mainSpeedY = 2;
  private double speedX = 5;
  private double speedY = 10;
  private final int DELAY = 25;

  private Ellipse2D.Double circle;
  private Thread animator;
  private Graphics2D g2;
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g2 = (Graphics2D) g;
    g2.setPaint(new Color( (int)((circle.y/HEIGHT)*255), (int)((circle.x/HEIGHT)*255), (int)((circle.y/HEIGHT)*255)));
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
    if(circle.x + RADIUS >= WIDTH || circle.x <= 0) {
    	speedX=mainSpeedX*2;
    	speedX = -speedX;
    }
    if(circle.y + RADIUS >= HEIGHT || circle.y <= 0) {
    	speedY = mainSpeedY*2;
    	speedY = -speedY;
    }
  	circle.x += speedX;
    circle.y += speedY;
    if(speedX > mainSpeedX) {
    	speedX--;
    } /*else {
    	speedX = mainSpeedX;
    }*/
    if(speedY > mainSpeedY) {
    	speedY--;
    } /*else {
    	speedY = mainSpeedY;
    }*/
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