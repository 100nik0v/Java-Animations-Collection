package boom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;

public class BoomAnimationFour extends JComponent implements ActionListener{
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   int counter = 0;
//Variables:
	double k = -2;
	int thetaO = 100;
	private boolean flag = false;
	private boolean flagged = false;
	double decimalDiv = 100000;
	double xl = 100;
//Timer initializing:
	Timer t;
	int argos = 1;
	public BoomAnimationFour() {
		t = new Timer((int) xl, (ActionListener) this);
	}
//	Paint Component:
	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		double theta = 0;
		Graphics2D g2 = (Graphics2D) g;
//		Background Rectangle:
		g2.setColor(Color.black);
		g2.fillRect(0, 0, screenW, screenH);
		g2.setColor(Color.white);
		g2.fillOval((screenW/2) - 267 , (screenH/2) - 88, 50, 50);
//		Animation While Loop:
		while (theta < thetaO) {
		 	double thetaAngle = 0;
			double x = 1;
			double cosTheta = -(Math.cos(theta)*k*x) + x - (Math.cos(theta*k)*x);
			double inDegreesCos = Math.toDegrees(cosTheta);
			double sinTheta = (Math.sin(theta)*k*x) + (-(Math.sin(k*theta)*x));
			double inDegreesSin = Math.toDegrees(sinTheta);
			double colourPicker = Math.random()*1000;
			if (colourPicker <300) {
			g2.setColor(Color.green);
			}
			if (colourPicker <600 && colourPicker >300) {
				g2.setColor(Color.white);
				}
			if (colourPicker >600 && colourPicker < 1000) {
				g2.setColor(Color.red);
				}
		double decimalsub = 4;
		t.start();
		decimalsub /= decimalDiv;
		k += decimalsub;
		double radius = 4;
		g2.fillOval((int)inDegreesCos + (screenW/2) - 300, (int)inDegreesSin + (screenH/2) - 66, (int) radius, (int) radius);
		theta += 0.1;
		}
		theta = 0;
	}
//Timer Listener:
	int i = 1;
	public void actionPerformed(ActionEvent e) {
		
		decimalDiv *= 1.1;
		flag = true;
		repaint();
	
	}	
}
