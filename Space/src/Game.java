import javax.swing.JFrame;

public class Game extends JFrame {

	private long timer;
	
	private double delta;
	
	private boolean running;
	
	private Thread thread;

	private Ship ship;
	
	private Screen screen;
	
	public Game(int w, int h) {
		ship = new Ship();
		screen = new Screen();
		running = false;
		this.setSize(w, h);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		thread = new Thread();
		this.add(screen);
		addKeyListener(InputManager.im);
		start();
	}
	
	public void start() {	
		running = true;
		thread.start();
		run();
		
	}
	
	public void render() {
		screen.render();
	}
	
	public void update() {
		ship.update();
		screen.draw(ship);
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		timer = System.currentTimeMillis();
		double bestTime = (Math.pow(10, 9) / 1000);
		delta = 0;
		int frames = 0;
		while (running) {
			long thisTime = System.nanoTime();
			long elapsedTime = thisTime - lastTime;
			lastTime = thisTime;
			delta += elapsedTime / bestTime;

			while (delta >= 1) {
				update();
				delta--;
			}

			render();
			frames++;

			if (System.currentTimeMillis() - timer >= 1000) {
//				System.out.println("FPS: " + frames);
				timer = System.currentTimeMillis();
//				n = 0;
				frames = 0;
			}
		}
	}
	public static void main(String[] args) {
		new Game(1920, 1080);
	}
}
