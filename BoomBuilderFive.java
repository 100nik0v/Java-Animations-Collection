package boom;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BoomBuilderFive extends JFrame implements ActionListener{
	public BoomBuilderFive () {
		add(new BoomAnimationThree());
		pack();
	}
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   public Dimension getPreferredSize() { return new Dimension(1000, screenH - 200); }
	   
	public void actionPerformed(ActionEvent e) {
		EventQueue.invokeLater ( ()->{
			JFrame fifthframe = new BoomBuilderSix();
			fifthframe.setTitle("BOOM Five!");
			fifthframe.setDefaultCloseOperation(fifthframe.HIDE_ON_CLOSE);
			fifthframe.setVisible(true);
		});
	}
}
