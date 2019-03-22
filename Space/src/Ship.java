import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ship {
	
	private int x, y;
	
	private BufferedImage image;
	
	public Ship() {
		try {
			image = ImageIO.read(getClass().getResourceAsStream("ship.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		x = 800;
		y = 500;
	}
	
	public void left() {
		x -= 1;
	}
	
	public void right() {
		x += 1;
	}
	
	public void up() {
		y -= 1;
	}
	
	public void down() {
		y += 1;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void update(){
		if(InputManager.im.isLeftDown()) {
			left();
		}
		if(InputManager.im.isRightDown()) {
			right();
		}
		if(InputManager.im.isUpDown()) {
			up();
		}
		if(InputManager.im.isDownDown()) {
			down();
		}
	}
	
	public BufferedImage getImage() {
		return image;
	}
}
