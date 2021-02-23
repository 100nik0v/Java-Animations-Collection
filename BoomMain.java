package boom;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class BoomMain implements ActionListener{
	static double play = 0;
	public static void main (String args[]) {
		EventQueue.invokeLater ( ()->{
			double x = 1;
			
			JFrame frame = new BoomBuilder();
			frame.setTitle("BOOM!");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}


	public void actionPerformed(ActionEvent e) {
		EventQueue.invokeLater ( ()->{
			double test = 1000;
			JFrame secondframe = new BoomBuilderTwo();
			secondframe.setTitle("BOOM TWO!");
			secondframe.setDefaultCloseOperation(secondframe.HIDE_ON_CLOSE);
			secondframe.setVisible(true);
		});
	}
}

