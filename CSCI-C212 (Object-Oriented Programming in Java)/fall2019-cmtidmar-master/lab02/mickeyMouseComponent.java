package lab02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.AffineTransform;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mickeyMouseComponent extends JComponent
{
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		Color flesh = new Color(255, 213, 181);
	
	
		
		// outline of head
		Ellipse2D.Double face = new Ellipse2D.Double(150, 230, 300, 300);
		g2.setColor(Color.BLACK);
		g2.fill(face);
		g2.draw(face);
		
		Ellipse2D.Double leftEar = new Ellipse2D.Double(75, 115, 175, 175);
		g2.fill(leftEar);
		g2.draw(leftEar);
		
		Ellipse2D.Double rightEar = new Ellipse2D.Double(350, 115, 175, 175);
		g2.fill(rightEar);
		g2.draw(rightEar);
		
		// whites of face
		Ellipse2D.Double leftForehead = new Ellipse2D.Double(190, 245, 130, 160);
		g2.setColor(flesh);
		g2.fill(leftForehead);
		g2.draw(leftForehead);
		
		Ellipse2D.Double rightForehead = new Ellipse2D.Double(280, 245, 130, 160);
		g2.setColor(flesh);
		g2.fill(rightForehead);
		g2.draw(rightForehead);
		
		Ellipse2D.Double rightCheek = new Ellipse2D.Double(340, 350, 100, 128);
		g2.fill(rightCheek);
		g2.draw(rightCheek);
		
		Ellipse2D.Double leftCheek = new Ellipse2D.Double(160, 350, 100, 128);
		g2.fill(leftCheek);
		g2.draw(leftCheek);
		
		
		Ellipse2D.Double chin = new Ellipse2D.Double(170, 326, 260, 200);
		g2.setColor(flesh);
		g2.fill(chin);
		g2.draw(chin);
		
		
		// Facial Features
		Ellipse2D.Double leftEye = new Ellipse2D.Double(240, 325, 40, 90);
		g2.setColor(Color.BLACK);
		g2.fill(leftEye);
		g2.draw(leftEye);
		
		//Ellipse2D.Double whitesleftEye = new Ellipse2D.Double(242, 332, 35, 80);
		//g2.setColor(Color.WHITE);
		//g2.fill(whitesleftEye);
		//g2.draw(whitesleftEye);
		
		//Ellipse2D.Double leftpupil = new Ellipse2D.Double(250, 355, 25, 60);
		//g2.setColor(Color.BLACK);
		//g2.fill(leftpupil);
		//g2.draw(leftpupil);
		
		Ellipse2D.Double rightEye = new Ellipse2D.Double(310, 325, 40, 90);
		g2.setColor(Color.BLACK);
		g2.fill(rightEye);
		g2.draw(rightEye);
		
		Ellipse2D.Double whitesleftEye = new Ellipse2D.Double(242, 332, 35, 80);
		g2.setColor(Color.WHITE);
		g2.fill(whitesleftEye);
		g2.draw(whitesleftEye);
		
		Ellipse2D.Double whitesrighteye = new Ellipse2D.Double(312, 332, 35, 80);
		g2.fill(whitesrighteye);
		g2.draw(whitesrighteye);
	
		Ellipse2D.Double leftpupil = new Ellipse2D.Double(250, 354, 25, 60);
		g2.setColor(Color.BLACK);
		g2.fill(leftpupil);
		g2.draw(leftpupil);
		
		Ellipse2D.Double rightpupil = new Ellipse2D.Double(315, 354, 25, 60);
		g2.fill(rightpupil);
		g2.draw(rightpupil);
		
		

		
		
	
		g2.fillArc(220, 405, 150, 150, -180, -180);
		g2.setColor(flesh);
		g2.fillArc(215, 407, 160, 160, -180, -180);
		
		g2.setColor(Color.BLACK);
		g2.fillOval(256, 425, 75, 50);

		
		
		
	}
}
