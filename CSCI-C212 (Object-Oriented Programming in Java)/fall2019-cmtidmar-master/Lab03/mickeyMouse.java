package lab03;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class mickeyMouse {
  int x, y; 
  double scale; 
  public mickeyMouse(int x, int y, double scale) {
    this.x = x; 
    this.y = y; 
    this.scale = scale; 
  }
  private int scale(int size) {
    return (int)(this.scale * size); 
  }
  public void draw(Graphics g) {
	 Color background = new Color(245, 206, 15);
	 Color flesh = new Color(255, 213, 181);
	  
	

    g.setColor(background);
	//g.setColor(Color.WHITE);
    g.fillRect(x+10, y+40, scale(600), scale(600)); 
    g.setColor(Color.BLACK); 
    g.drawRect(x+10, y+40, scale(600), scale(600)); 
    g.setColor(Color.BLACK); 
    
    
    
    int left = 5;
    //Outline of Head
    g.fillOval(x + scale(150 -left),y + scale( 300), scale(300), scale(300)); 
    g.setColor(Color.BLACK); 
   
    g.fillOval(x + scale(75-left), y + scale(195), scale(175), scale(175)); // y-axis = +80 

    g.fillOval(x + scale(345-left), y + scale(195), scale(175), scale(175)); 
    
    //Whites of Face
    g.setColor(flesh); 
    g.fillOval(x + scale( 190-left), y + scale(320), scale(130), scale( 160)); 

    g.fillOval(x + scale(280-left), y + scale(320), scale(130), scale( 160)); 

    g.fillOval(x + scale(165-left), y + scale( 425), scale( 100), scale(128)); 
 
    g.fillOval(x + scale(335-left), y + scale( 425), scale(100), scale( 128)); 
    
    g.fillOval(x + scale(170-left), y + scale(397), scale( 260), scale( 200)); 
    
    //Facial Features
    g.setColor(Color.BLACK);
    g.fillOval(x + scale(240-left), y + scale(405), scale( 40), scale( 90)); 
    g.fillOval(x + scale(310-left), y + scale(405), scale( 40), scale( 90)); 
    g.setColor(Color.WHITE);
    g.fillOval(x + scale(243-left), y + scale(413), scale( 35), scale( 80)); 
    g.fillOval(x + scale(312-left), y + scale(413), scale( 35), scale( 80));
    
    g.setColor(Color.BLACK);
    g.fillOval(x + scale(250-left), y + scale(434), scale( 25), scale( 60));
    g.fillOval(x + scale(315-left), y + scale(434), scale( 25), scale( 60));
    
    g.fillArc(x + scale(220-left), y + scale(480), scale(150), scale(150), -180, -180);
    g.setColor(flesh);
    g.fillArc(x + scale(215-left), y + scale(485), scale(160), scale(160), -180, -180);
    g.setColor(Color.BLACK);
    g.fillOval(x + scale(256-left), y + scale(505), scale(75), scale(50));
    
  }
}
