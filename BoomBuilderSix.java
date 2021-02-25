package boom;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BoomBuilderSix extends JFrame implements ActionListener{
	public BoomBuilderSix () {
		add(new BoomAnimationCredits());
		pack();
	}
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width; 
	   public Dimension getPreferredSize() { return new Dimension(screenW, screenH); }
	
	public void actionPerformed(ActionEvent e) {
		EventQueue.invokeLater ( ()->{
			JFrame sixthframe = new BoomBuilderSeven();
			sixthframe.setTitle("BOOM do!");
			sixthframe.setDefaultCloseOperation(sixthframe.HIDE_ON_CLOSE);
			sixthframe.setVisible(true);
		});
	}
	   
}
