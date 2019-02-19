import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
public class SnakeGame extends JFrame {
	public static final int WIDTH = 800, HEIGHT = 600, SLEEPTIME = 50, L = 1,R = 2, U = 3, D = 4; //Reminder: sleeptime controls speed
	BufferedImage offersetImage= new BufferedImage(WIDTH, HEIGHT,BufferedImage.TYPE_3BYTE_BGR);; //Learned this on oracle, represents an image
	Rectangle rect = new Rectangle(20, 40, 15 * 50, 15 * 35);									// with 8-bit RGB color components
	Snake snake;																				// Buffered image class is subclass of Image class
	Node node;																					// used to help me draw - learned on oracle
	
	public SnakeGame() {
		snake = new Snake(this);
		createNode();
		this.setBounds(100, 100, WIDTH, HEIGHT); 		//set bounds 
		this.addKeyListener(new KeyAdapter() {			//Key reader
			public void keyPressed(KeyEvent key) { 
				switch (key.getKeyCode()) {            //switch statement lets me have different execution paths
				case KeyEvent.VK_LEFT:
					snake.dir = L; 			//VK key event for left - switch block/case
					break;
				case KeyEvent.VK_RIGHT:
					snake.dir = R;			//VK key event for right - switch block/case
					break;
				case KeyEvent.VK_UP:
					snake.dir = U;			//VK key event for up - switch block/case
					break;
				case KeyEvent.VK_DOWN:
					snake.dir = D;			//VK key event for down - switch block/case
				}
			}
		});
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //close application
		this.setVisible(true);  						// making it all visible
		new Thread(new ThreadUpadte()).start(); 	//We never went over threads in class, but I've learned about them online
													// and found an example that used them and tried to implement them myself
													// in my game, they do the updating of the snake
	}
	public void paint(Graphics g) {
		Graphics2D graphic = (Graphics2D) offersetImage.getGraphics();  // drawing w 2D graphics
		graphic.setColor(Color.white);
		graphic.fillRect(0, 0, WIDTH, HEIGHT);
		graphic.setColor(Color.black);
		graphic.drawRect(rect.x, rect.y, rect.width, rect.height); //drawing of the rectangle
		if (snake.hit(node)) {										// if the snake hits
			createNode();
		}
		snake.draw(graphic);
		node.draw(graphic);
		g.drawImage(offersetImage, 0, 0, null);
	}
	class ThreadUpadte implements Runnable {		//This is my threadUpdate class; it is updating the board
		public void run() {							// in real time to make sure it is up to date
			while (true) {							// had lots of help w this
				try {
					Thread.sleep(SLEEPTIME);        //Try statement to test for statements that can 
					repaint();}                     // throw exceptions
				 catch (InterruptedException e) { 	//	This executes when exception is thrown
					e.printStackTrace();
				}
			}
		}
	}
	public void createNode() {
		int x = (int) (Math.random() * 650) + 50,y = (int) (Math.random() * 500) + 50;
		node = new Node(x, y, Color.blue);
	}
	public static void main(String args[]) {
		new SnakeGame();
	}
}
class Node {
	int x, y, width = 15, height = 15;						//cube size
	Rectangle rect = new Rectangle(x, y, width, height);
	Color color;
	
	public Node(int x, int y, Color color) {
		this.x = x; this.y = y;
		this.color = color;
	}
	public void draw(Graphics2D graphic) {
		graphic.setColor(color);
		graphic.drawRect(x, y, width, height);
	}
	public Rectangle getRect() {
		rect.x = x; rect.y = y;
		return rect;
	}
}
class Snake {   
	public List<Node> nodes = new ArrayList<Node>();
	SnakeGame interFace;
	int dir=SnakeGame.R;
	
	public Snake(SnakeGame interFace) {
		this.interFace = interFace;
		nodes.add(new Node(20 + 150, 40 + 150, Color.black));
		addNode();
	}
	public boolean hit(Node node) {					//make this boolean
		for (int x = 0; x < nodes.size(); x++) {
			if (nodes.get(x).getRect().intersects(node.getRect())) {
				addNode();
				return true;
			}
		}
		return false;
	}
	public void draw(Graphics2D graphic) {
		for (int x = 0; x < nodes.size(); x++) {
			nodes.get(x).draw(graphic);
		}
		move();
	}
	public void move() {
		nodes.remove((nodes.size() - 1));
		addNode(); 							//adding one after 
	}
	public void addNode() {
		Node NextNode = nodes.get(0);
		switch (dir) {
		case SnakeGame.L: //left instance
			if (NextNode.x <= 20) {
				NextNode = new Node(20 + 15 * 50, NextNode.y, Color.black);
			}
			nodes.add(0, new Node(NextNode.x - NextNode.width, NextNode.y, Color.black ));
			break;
		case SnakeGame.R: //right instance
			if (NextNode.x >= 20 + 15 * 50 - NextNode.width) {
				NextNode = new Node(20 - NextNode.width, NextNode.y, Color.black);
			}
			nodes.add(0, new Node(NextNode.x + NextNode.width, NextNode.y, Color.black));
			break;
		case SnakeGame.U: //up instance
			if (NextNode.y <= 40) {
				NextNode = new Node(NextNode.x, 40 + 15 * 35, Color.black);
			}
			nodes.add(0, new Node(NextNode.x, NextNode.y - NextNode.height, Color.black));
			break;
		case SnakeGame.D: //down instance
			if (NextNode.y >= 40 + 15 * 35 - NextNode.height) {
				NextNode = new Node(NextNode.x,40 - NextNode.height, Color.black);
			}
			nodes.add(0, new Node(NextNode.x, NextNode.y + NextNode.height, Color.black));
			break;
		}
	}
}