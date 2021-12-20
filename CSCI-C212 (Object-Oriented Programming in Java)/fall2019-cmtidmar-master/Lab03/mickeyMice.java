package lab03;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics; 

public class mickeyMice extends JComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    frame.setVisible(true); 
    int width = 600, height = 600;
    frame.setSize(width + 20, height + 40); 
    frame.setTitle("Mickey Mice");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mickeyMice drawing = new mickeyMice(width, height); 
    frame.add(drawing);     
  }
  int width, height; 
  mickeyMouse a, b, c; 
  public mickeyMice(int width, int height) {
    this.width = width;
    this.height = height; 
    a = new mickeyMouse( 20,  50, 0.3);         
    b = new mickeyMouse(220,  20, 0.5);         
    c = new mickeyMouse( 40, 230, 0.4);         
  }
  public void paintComponent(Graphics g) {
    a.draw(g); 
    b.draw(g); 
    c.draw(g); 
  }
}
