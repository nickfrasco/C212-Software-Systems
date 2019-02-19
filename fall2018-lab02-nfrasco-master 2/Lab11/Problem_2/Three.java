import java.awt.event.*;
import javax.swing.*;


public class Three implements ActionListener {
	public static void main(String[] args) {
		Three three = new Three();					//new Three should be capital (-2)
		Timer timer = new Timer(1000,three);		//new Timer should be capital (-2)
		timer.start();
	}
	int count = 0;									//forgot semicolon here (-1)
	public void actionPerformed(ActionEvent e) {
		this.count += 1;
		System.out.println( this.count );
	}
}

//I think a total of 5 points should be deducted for these 3 errors
// 							(28/33) - 85%