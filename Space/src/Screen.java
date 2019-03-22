import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {
	
	private Ship ship;
	
	public Screen() {
	}
	
	public void render() {
		repaint();
	}
	
	public void draw(Ship s) {
		ship = s;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 1920, 1080);
		g.drawImage(ship.getImage(), ship.getX(), ship.getY(), 100, 200, null);
		g.dispose();
	}
}
