import javax.swing.JFrame;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;							 //forgot event in this import (-2)

public class One extends JFrame implements MouseMotionListener{
	public One() {
		this.setVisible(true);
		this.setSize(400,400);
	}
		public void mouseMoved(MouseEvent e) {
			System.out.println("Mouse being moved...");	
		}
		
		public void mouseDragged(java.awt.event.MouseEvent e) {
			int x = e.getX(); int y = e.getY();
			System.out.println("(" + x + " , " + y + ")");
		} 													//forgot this bracket (-1)
	public static void main(String[] args) {
		One a = new One();
		a.addMouseMotionListener(a);     					//forgot to add the a (-1)

	}
}


//I think a total of 4 points should be deducted for these 2 errors
//							(29/33) - 88%