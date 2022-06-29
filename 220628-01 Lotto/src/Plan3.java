import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



 class Plan3{
	 
	 static void by() { 
	 
	 Dimension dim = new Dimension(400,400);
		
		JButton jbt1 = new JButton();
		
		JButton jbt2 = new JButton();
		
		JButton jbt3 = new JButton();
		
		JButton jbt4 = new JButton();
		
		JButton jbt5 = new JButton();
		jbt5.setBounds(351, 167, 33, 9);
		
		JFrame jf = new JFrame("plan3");
		jf.setLocation(200, 400);
		jf.setPreferredSize(dim);
		
		JPanel pnl1 = new JPanel();
		pnl1.setLocation(100, 300);
		pnl1.setLayout(new BoxLayout(pnl1,BoxLayout.X_AXIS));
		pnl1.add(new JLabel("line1"));
		pnl1.add(new JTextField());
		pnl1.setBackground(Color.red);
		pnl1.setVisible(true);
		
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(new BoxLayout(pnl2,BoxLayout.X_AXIS));
		pnl2.add(new JLabel("line2"));
		pnl2.add(new JTextField());
		pnl2.setBackground(Color.blue);
		pnl2.setVisible(true);
		
		JPanel pnl3 = new JPanel();
		pnl3.setLayout(new BoxLayout(pnl3,BoxLayout.X_AXIS));
		pnl3.add(new JLabel("line3"));
		pnl3.add(new JTextField());
		pnl3.setBackground(Color.DARK_GRAY);
		pnl3.setVisible(true);
		
		JPanel pnl4 = new JPanel();
		pnl4.setLayout(new BoxLayout(pnl4,BoxLayout.X_AXIS));
		pnl4.add(new JLabel("line4"));
		pnl4.add(new JTextField());
		pnl4.setBackground(Color.black);
		pnl4.setVisible(true);
		
		
		JPanel pnl5 = new JPanel();
		pnl5.setLayout(null);
		JLabel label = new JLabel("line5");
		label.setBounds(0, 164, 26, 15);
		pnl5.add(label);
		JTextField textField = new JTextField();
		textField.setBounds(26, 0, 325, 361);
		pnl5.add(textField);
		pnl5.setBackground(Color.yellow);
		pnl5.setVisible(true);
		
		jf.getContentPane().add(pnl1);
		jf.getContentPane().add(pnl2);
		jf.getContentPane().add(pnl3);
		jf.getContentPane().add(pnl4);
		jf.getContentPane().add(pnl5);
		
		pnl1.add(jbt1);
		pnl2.add(jbt2);
		pnl3.add(jbt3);
		pnl4.add(jbt4);
		pnl5.add(jbt5);
		
		
		pnl1.setBounds(30 ,30, 330, 50);
		pnl2.setBounds(30 ,80, 330, 50);		
		pnl3.setBounds(30 ,130, 330, 50);
		pnl4.setBounds(30 ,180, 330, 50);
		pnl5.setBounds(30 ,230, 330, 50);
		
		jf.pack();
		
		jf.setVisible(1==1);
		
	
	
	
	 }















public class Plan3 {

	public void main(String[] args) {
		
		
		by();
		
	}
	
	
		
}
}
