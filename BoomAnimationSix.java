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

public class BoomAnimationSix extends JComponent implements ActionListener{
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
	double xl = 1;
//Timer initializing:
	Timer t;
	int argos = 1;
	public BoomAnimationSix() {
		t = new Timer(1, (ActionListener) this);
	}
//	Paint Component:
	  double decimalsub = 4;
	  double x = 1;
	  double y = 10;
	 public void paintComponent(Graphics g)
	   {

			super.paintComponent(g);
//		   Scanner in = new Scanner(System.in);
		   Graphics2D g2 = (Graphics2D) g;
//	      System.out.println("Type in the side number:");
//	      int sideNum = Integer.parseInt( in.nextLine());
		  double theta = 0;
		  double k = 0.001;
		  double kt = 2;
		  double decimal = 0.1;
		  g2.setColor(Color.black);
		  g2.fillRect(0, 0, screenW, screenH);
		  g2.setColor(Color.WHITE);
		  while (theta < 1000) {
			  //Calculations:
			  
			  double cosTheta = -(Math.cos(theta)*k*x) + x - (Math.cos(theta*k)*x);
			  double inDegreesCos = Math.toDegrees(cosTheta)/y;
			  double sinTheta = (Math.sin(theta)*k*x) + (-(Math.sin(k*theta)*x));
			  double inDegreesSin = Math.toDegrees(sinTheta)/y;
	      //The Actual Drawing:
			  double radius = 1; 
			  t.start();
			  decimalsub /= 36; 
		  g2.drawOval((int) (inDegreesCos) + screenW/2, (int) (inDegreesSin) + screenH/2, (int) radius, (int) radius);
		  g2.drawOval((int) (inDegreesCos) + screenW/2, -((int) (inDegreesSin) + screenH/2), (int) radius, (int) radius);
		  theta++;
		  k -= decimalsub;
//		  k -= 0.00001;
		  cosTheta = -(Math.cos(theta)*kt*x) + x - (Math.cos(theta*kt)*x);
		  inDegreesCos = Math.toDegrees(cosTheta)/y;
		  sinTheta = (Math.sin(theta)*kt*x) + (-(Math.sin(kt*theta)*x));
		  inDegreesSin = Math.toDegrees(sinTheta)/y;
      //The Actual Drawing:
		  radius = 1; 
		  t.start();
		  decimalsub /= 36; 
	  g2.drawOval((int) (inDegreesCos) + screenW/2, (int) (inDegreesSin) + screenH/2, (int) radius, (int) radius);
	  theta++;
	  kt -= decimalsub;
//	  k -= 0.00001;
		  }
	   }
//Timer Listener:
	int i = 1;
	public void actionPerformed(ActionEvent e) {
		
		y *= 1.001;
		decimalsub /=10;
		k -= 1;
		x -= 0.1;
		repaint();
	
	}	
}
