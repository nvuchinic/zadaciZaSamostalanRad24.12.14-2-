package nacin2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener{
MovingCircle2 mc=new MovingCircle2();
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode=e.getKeyCode();
		if(keyCode==KeyEvent.VK_UP)
			mc.up();
		if(keyCode==KeyEvent.VK_DOWN)
			mc.down();	
		if(keyCode==KeyEvent.VK_RIGHT)
			mc.right();
		if(keyCode==KeyEvent.VK_LEFT)
			mc.left();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		mc.moveX=0;
		mc.moveY=0;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
