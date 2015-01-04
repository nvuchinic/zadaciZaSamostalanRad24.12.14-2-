package nacin2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode=e.getKeyCode();
		if(keyCode==KeyEvent.VK_UP)
			MovingCircle2.up();
		if(keyCode==KeyEvent.VK_DOWN)
			MovingCircle2.down();	
		if(keyCode==KeyEvent.VK_RIGHT)
			MovingCircle2.right();
		if(keyCode==KeyEvent.VK_LEFT)
			MovingCircle2.left();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		MovingCircle2.moveX=0;
		MovingCircle2.moveY=0;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
