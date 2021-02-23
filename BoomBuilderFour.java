package boom;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BoomBuilderFour extends JFrame implements ActionListener{
	public BoomBuilderFour () {
		add(new BoomAnimationTwo());
		pack();
		}
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   public Dimension getPreferredSize() { return new Dimension(1000, screenH - 200); }

	   public void actionPerformed(ActionEvent e) {
			EventQueue.invokeLater ( ()->{
				double test = 1000;
				JFrame secondframe = new BoomBuilderFive();
				secondframe.setTitle("BOOM THREE!");
				secondframe.setDefaultCloseOperation(secondframe.HIDE_ON_CLOSE);
				secondframe.setVisible(true);
			});
	   }
}
