import java.awt.*;											//unnecessary import (-.5)
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;




public class Nine extends JFrame implements ActionListener{
	JTextField t;											//Put this in wrong spot (-.5)
	JLabel i;												//Put this in wrong spot (-.5)
	public Nine() {
		this.t= new JTextField( );
		t.setPreferredSize(new Dimension(60,20));
		this.i = new JLabel("Welcome");
		JButton b = new JButton("Push me!");				//forgot to add this text (-1)
		b.addActionListener(this);							//forgot this line (-2.5)
		JPanel p = new JPanel();
		p.add(this.i);
		p.add(b);
		p.add(this.t);
		this.add(p);										//forgot this line (-2)
		this.setVisible(true);
		this.setSize(400, 200);
	}
	public void actionPerformed(ActionEvent e) {
		this.i.setText( this.t.getText());
	}
	public static void main(String[] args) {
		JFrame a = new Nine();

	}

}

//I think a total of 7 points should be deducted for these 6 errors
//							(26/33) - 79%