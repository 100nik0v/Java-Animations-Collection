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

public class BoomAnimationSeven extends JComponent implements ActionListener{
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
	public BoomAnimationSeven() {
		t = new Timer((int) xl, (ActionListener) this);
	}
//	Paint Component:
	  double decimalsub = 4;
	  double x = 0;
	  double adder = 10;
	  
	 public void paintComponent(Graphics g)
	   {
		 double y = 500-adder;
			super.paintComponent(g);
//		   Scanner in = new Scanner(System.in);
		   Graphics2D g2 = (Graphics2D) g;
//	      System.out.println("Type in the side number:");
//	      int sideNum = Integer.parseInt( in.nextLine());
		   t.start();
		  g2.setColor(Color.black);
		  g2.fillRect(0, 0, screenW, screenH);
		  g2.setColor(Color.WHITE);
	int loop = 0;
	double oop = 10; 
		  if (loop < 100)	{
	  g2.fillRect( (int) x , (int) y - (int)oop, 10 , 10);
	  loop++;
	  oop +=10;
		  }
//	  k -= 0.00001;
		  }
//Timer Listener:
	int i = 1;
	public void actionPerformed(ActionEvent e) {
		
		adder *= -1;
		x += 10;
		repaint();
	
	}	
}
