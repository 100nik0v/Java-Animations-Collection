package boom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;



	public class Buttons extends JPanel implements ActionListener{
		private JPanel buttonPanel;
		private JPanel exitPanel;
		Toolkit kit = Toolkit.getDefaultToolkit();
		   Dimension screenSize = kit.getScreenSize();
		   int screenH = screenSize.height;
		   int screenW = screenSize.width; 
			Timer t;
		public Buttons () {
			
			double messenger = 0;
			t = new Timer(50, (ActionListener) this);
//		Button Creation:		
		JButton playing = new JButton("Random");
		Image imgage = new ImageIcon("E:/abab.PNG").getImage();
		JButton exit = new JButton("EXIT");
		JButton playerTwo = new JButton("Gears");
		JButton playerFour = new JButton("Fidget Spinner");
		JButton playerFive = new JButton("Sparkles");
		JButton playerSix = new JButton("I Dunno");
		JButton credits = new JButton("Credits");
		JButton playerSeven = new JButton("NUM SEVEN");
		JButton playerEight = new JButton("Rectangles");
		JSlider slider = new JSlider(1, 1000, 100);

		
//		Class Variables:
		BoomMain retro = new BoomMain();
		BoomBuilderTwo two = new BoomBuilderTwo();
		BoomBuilderThree three = new BoomBuilderThree();
		BoomBuilderFour four = new BoomBuilderFour();
		BoomBuilderFive five = new BoomBuilderFive();
		BoomBuilderSix six = new BoomBuilderSix();
		BoomBuilderSeven seven = new BoomBuilderSeven();
		BoomBuilderEight eight = new BoomBuilderEight();
		BoomBuilderNine nine = new BoomBuilderNine();
		
//      Adding Action Listener
		playing.addActionListener(retro);
		exit.addActionListener(two);
		playerTwo.addActionListener(three);
		playerFour.addActionListener(four);
		credits.addActionListener(five);
		playerFive.addActionListener(six);
		playerSix.addActionListener(seven);
		playerSeven.addActionListener(eight);
		playerEight.addActionListener(nine);
		
//		Making New Panel
		buttonPanel = new JPanel();
		exitPanel = new JPanel();
		
//		Add Button to Panel
		exitPanel.add(exit);
		exitPanel.add(credits);
		buttonPanel.add(playing);
		buttonPanel.add(playerTwo);
		buttonPanel.add(playerFour);
		buttonPanel.add(playerFive);
		buttonPanel.add(playerSix);
		buttonPanel.add(playerSeven);
		buttonPanel.add(playerEight);
		
//		Adding Panel to Frame:
		add(exitPanel);
		add(buttonPanel);

		buttonPanel.setLayout(new GridLayout(2, 2));
		exitPanel.setLayout(new GridLayout(1,1));

	}
		double d = 10;
		double looper = 0;
		double extraLoops = 50;
		double drawer = 2;
		public void paintComponent (Graphics g) {
			double theta = 0;
			Color randomColor = new Color(10, 10, 10);
			g.setColor(randomColor);
			g.fillRect(0,0,screenW,screenH);
			Font helevicta = new Font("Helevicta Bold", Font.BOLD, 200);
			g.setFont(helevicta);
			
			while (theta < extraLoops) {
				double y = Math.cos(theta)/d;
				double x = Math.sin(theta)/d;
			
				g.setColor(Color.ORANGE);			
					g.fillOval((int) x + screenW/(int)drawer, (int) y + screenH/(int)drawer, 20, 20);
				g.setColor(Color.GREEN);
					g.fillRect(100+ (int) x + screenW/(int)drawer, (int) y + screenH/(int)drawer, 10, 10);
				g.setColor(Color.RED);	
					g.fillRect(-100 + (int) x + screenW/(int)drawer, (int) y + screenH/(int)drawer, 10, 10);
				theta++;
			}
		
			t.start();
			while (looper < 1) {
				g.setColor(Color.WHITE);
				g.drawString("BOOM", 50, screenH/2);
				g.drawString("Animations", (screenW/2) - 400 , (screenH/2) + 200);
				looper++;
			}
		}

		public void actionPerformed(ActionEvent e) {
			d  = Math.random()/100;
			if (d < 0.001) {
				d = 10;
			}
			looper = 0;
			repaint();
		}
		
	}

