import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**very simple program that draws circle and then move it based on which arrow key user presses.
 * 
 * @author Nermin
 *
 */
public class MovingCircle3 extends JPanel implements ActionListener {
	Timer t=new Timer(5,this);
	int x=0;
	int y=0;
	int radius=50;
	int moveX=0;
	int moveY=0;
	KeyHandler2 keyHandler2;
	
	/**
	 * constructor method
	 */
	public MovingCircle3(){
		t.start();
		keyHandler2=new KeyHandler2();
		addKeyListener(keyHandler2);
		setFocusable(true);
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(x, y, 50, 50);
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);

	}

	



	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		x+=moveX;
		y+=moveY;
	}

	/**
	 * method for moving the circle up, is called when user press the up arrow key. 
	 * It is used for changing y coordinate of circle
	 */
	public void up(){
		moveX=0;
		moveY=-1;
	}
	
	/**
	 * method for moving circle down,is called when user press the down arrow key.
	 * It is used for changing y coordinate of circle
	 */
	public void down(){
		moveX=0;
		moveY=1;
	}
	
	/**
	 * method for moving circle right, is called when user press the right arrow key.
	 * It is used for changing x coordinate of circle
	 */
	public void right(){
		moveX=1;
		moveY=0;
	}
	
	/**
	 * method for moving circle left,is called when user press the left arrow key.
	 * It is used for changing x coordinate of circle
	 */
	public void left(){
		moveX=-1;
		moveY=0;
	}
	
	public class KeyHandler2 implements KeyListener{
		
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode=e.getKeyCode();
				if(keyCode==KeyEvent.VK_UP)
					up();
				if(keyCode==KeyEvent.VK_DOWN)
					down();	
				if(keyCode==KeyEvent.VK_RIGHT)
					right();
				if(keyCode==KeyEvent.VK_LEFT)
					left();
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				moveX=0;
				moveY=0;
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	}
			
	public static void main(String[] args) {
		MovingCircle3 content=new MovingCircle3();
		JFrame window=new JFrame("Moving circle");
		window.setSize(600,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(content);
		window.setVisible(true);
}
}
