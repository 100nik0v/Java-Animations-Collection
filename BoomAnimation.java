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

public class BoomAnimation extends JComponent implements ActionListener{
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   int counter = 0;
//  Variables:
	double k = 2;
	double thetaO = 100;
	private boolean flag = false;
	private boolean flagged = false;
	double decimalDiv = 1000000;
	double xl = 100;
// Timer initializing:
	Timer t;
	double argos;
	public BoomAnimation() {
		t = new Timer( (int) xl, (ActionListener) this);
	}
//	Paint Component:
	double lol = Math.random()*5;
	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		double theta = 0;
		Graphics2D g2 = (Graphics2D) g;
//		Background Rectangle:
		g2.setColor(Color.black);
		g2.fillRect(0, 0, screenW, screenH);
//		Animation While Loop:
		while (theta < thetaO) {
			
		
			double thetaAngle = 0;
			double x = 1;
			double cosTheta = -(Math.cos(theta)*argos*x) + x - (Math.cos(theta*argos)*x);
			double inDegreesCos = Math.toDegrees(cosTheta);
			double sinTheta = (Math.sin(theta)*argos*x) + (-(Math.sin(argos*theta)*x));
			double inDegreesSin = Math.toDegrees(sinTheta);
			g2.setColor(Color.white);
		double decimalsub = 4;
		t.start();
		decimalsub /= decimalDiv;
		argos -= decimalsub;
		double radius = 10;
		
		double colorPicker = Math.random()*250;
		double colorPickerTwo = Math.random()*250;
		double colorPickerThree = Math.random()*250;
		Color randomColor = new Color((int) colorPicker, (int) colorPickerTwo, (int) colorPickerThree);
		g2.setColor(randomColor);
		
		
		g2.fillOval((int) (((int)inDegreesCos *lol) + (screenW/2) - 300), (int) ((int)inDegreesSin*lol + (screenH/2) - 66), (int) radius, (int) radius);
		theta += 0.1;
		}
		theta = 0;
	}
//  Timer Listener:
	int i = 1;
	public void actionPerformed(ActionEvent e) {
		decimalDiv /= 1.1;
		flag = true;
		repaint();
	
	}	
}
