package boom;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public 
class BoomBuilderTwo extends JFrame implements ActionListener{
	public BoomBuilderTwo () {
		double n = (Math.random()*1);
		add(new BoomAnimation());
		pack();
		
		}
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   public Dimension getPreferredSize() { return new Dimension(1000, screenH - 200); }

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
				
	}
}
