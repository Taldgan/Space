import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputManager implements KeyListener {

	public static InputManager im = new InputManager(); 
	
	private boolean left, right, up, down;
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT) {
			System.out.println("leftOOO");
			left = true;
		}
		if(e.getKeyCode() == e.VK_RIGHT) {
			right = true;
		}
		if(e.getKeyCode() == e.VK_UP) {
			up = true;
		}
		if(e.getKeyCode() == e.VK_DOWN) {
			down = true;
		}
		
		
	}

	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT) {
			left = false;
		}
		if(e.getKeyCode() == e.VK_RIGHT) {
			right = false;
		}
		if(e.getKeyCode() == e.VK_UP) {
			up = false;
		}
		if(e.getKeyCode() == e.VK_DOWN) {
			down = false;
		}
	}

	public boolean isLeftDown() {
		return left;
	}
	
	public boolean isRightDown() {
		return right;
	}
	
	public boolean isUpDown() {
		return up;
	}
	
	public boolean isDownDown() {
		return down;
	}
	public void keyTyped(KeyEvent e) {
		
	}

}
