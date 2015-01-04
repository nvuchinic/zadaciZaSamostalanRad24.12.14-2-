import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;

public class MovingCircle extends JPanel implements ActionListener, KeyListener {
	Timer t=new Timer(5,this);
	int x=0;
	int y=0;
	int radius=50;
	int moveX=0;
	int moveY=0;
	
	public MovingCircle(){
		t.start();
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(x, y, 50, 50);
		g.setColor(Color.red);
		g.fillOval(x, y, 50, 50);

	}

	

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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		x+=moveX;
		y+=moveY;
	}

	public void up(){
		moveX=0;
		moveY=-1;
	}
	
	public void down(){
		moveX=0;
		moveY=1;
	}
	
	public void right(){
		moveX=1;
		moveY=0;
	}
	
	public void left(){
		moveX=-1;
		moveY=0;
	}
	public static void main(String[] args) {
		MovingCircle content=new MovingCircle();
		JFrame window=new JFrame("Moving circle");
		window.setSize(600,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(content);
		window.setVisible(true);
}
}