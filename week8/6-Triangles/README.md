# Triangles

Now, we are going to put our mouse in action.

Watch [this video example](example.mp4) and you will understand what needs to be done.

* Each 3 clicks should create a new triangle with different color each time (random color)
* You need to call `repaint()` to call `paintComponent` again. This will do the magic
* To listen for mouse input, your `Canvas` class should implement a `MouseListener` interface. The `mouseClicked` is the method you are looking for. **Examine the event argument.**

Here is a simple boilerplate of the `Canvas.java`:

```java
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Canvas extends JPanel implements MouseListener {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 800;
  
  
  public Canvas() {
    // very important here - addMouseListener(this)
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    addMouseListener(this);
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    
    // magic happens here  
  }
  
  @Override
  public void mouseClicked(MouseEvent e) {
    // magic happens here 
    
    // calling repaint is important 
    repaint();
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    
  }
}

```
