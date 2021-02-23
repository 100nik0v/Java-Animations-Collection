package boom;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BoomBuilderTen extends JFrame{
	public BoomBuilderTen (){
		add(new BoomAnimationSeven());
		pack();
	}
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   public Dimension getPreferredSize() { return new Dimension(1000, screenH - 200); }
	   
}
