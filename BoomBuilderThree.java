package boom;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BoomBuilderThree implements ActionListener{
	

	public void actionPerformed(ActionEvent e) {
		EventQueue.invokeLater ( ()->{
			double test = 1000;
			JFrame thirdframe = new BoomBuilderFour();
			thirdframe.setTitle("BOOM LOL!");
			thirdframe.setDefaultCloseOperation(thirdframe.HIDE_ON_CLOSE);
			thirdframe.setVisible(true);
		});
	}
}