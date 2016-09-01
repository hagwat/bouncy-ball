import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

public class BouncyBall implements Ball {

	private double diameter = 9 + Math.random()*2;
	private double x = Math.random() * 100;
	private double y = Math.random() * 460;
	private double dx = Math.random() * 5;
	private double dy = 0;
	private Color color = new Color(new Double(Math.random() * 256).intValue(),
			new Double(Math.random() * 256).intValue(), new Double(Math.random() * 256).intValue());

	public BouncyBall() {

	}

	@Override
	public void tick(List<Ball> coll) {

		if (y >= (470 - diameter)) {
			dy = -(dy);
		} else {
			dy = dy + 0.5;
		}

		x += dx;
		y += dy;
	}

	public double getWidth(){
		return diameter;
	}
	
	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public Color getColor() {
		return color;
	}

}
