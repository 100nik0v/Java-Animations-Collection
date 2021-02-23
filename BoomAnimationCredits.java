package boom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class BoomAnimationCredits extends JComponent implements ActionListener{
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   int counter = 0;
//Variables:
	double k = -2;
	int thetaO = 200;
	private boolean flag = false;
	private boolean flagged = false;
	double decimalDiv = 100000;
	double xl = 10;
	double ringer = screenH - 10;
//Timer initializing:
	Timer t;
	int argos = 1;
	public BoomAnimationCredits() {
		t = new Timer((int) xl, (ActionListener) this);
	}
//	Paint Component:
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, screenW, screenH*2);
		g2.setColor(Color.white);
		Font helevicta = new Font("Helevicta Bold", Font.BOLD, 30);
		g2.setFont(helevicta);
		g2.drawString("Made By:", screenW/2 - 15, (int) ringer - 30);
		g2.drawString("Alexander Sotnikov", screenW/2 - 70, (int) ringer + 50);
		g2.drawString("Made in:", screenW/2 - 0, (int) ringer + 200);
		g2.drawString("Java", screenW/2 + 20, (int) ringer + 270);
		g2.drawString("Resources Used:", screenW/2 - 50, (int) ringer + 360);
		g2.drawString("Core Java", screenW/2 - 15, (int) ringer + 430);
		
		int theta = 0;
		while (theta < thetaO) {
		double colorPicker = Math.random()*250;
		double colorPickerTwo = Math.random()*250;
		double colorPickerThree = Math.random()*250;
//		Oval Coordinates
		double x = Math.random()*3000;
		double y = Math.random()*1000;
		double width = Math.random()*30;
		double height = Math.random()*40;
//		Rect Coordinates:
		double xT = Math.random()*3000;
		double yT = Math.random()*1000;
		double widthT = Math.random()*30;
		double heightT = Math.random()*40;
		if (x > (screenW/2) - 100 && x < (screenW/2) + 220) {
			x = Math.random()*500;
		}
		if (xT > (screenW/2) - 100 && xT < (screenW/2) + 220) {
			xT = Math.random()*500;
		}
		Color randomColor = new Color((int) colorPicker, (int) colorPickerTwo, (int) colorPickerThree);
		g2.setColor(randomColor);
		g2.fillOval((int) x,(int) y,(int) width,(int) height);
		g2.fillRect((int) xT,(int) yT,(int) widthT,(int) heightT);
		theta++;
		}
		
		t.start();
	}
//Timer Listener:
	int i = 1;
	public void actionPerformed(ActionEvent e) {
		i++;
		ringer -= 2;
		repaint();
		if (i == 700) {
			JOptionPane.showMessageDialog(null, "Quit program?");
			System.exit(0);
		}
	}	
}