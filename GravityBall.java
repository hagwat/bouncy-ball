import java.awt.Color;
import java.util.List;

public class GravityBall implements Ball {

	private double diameter = 15;
	private double x = Math.random() * 400;
	private double y = Math.random() * 460;
	private Color color = new Color(new Double(Math.random() * 256).intValue(),
			new Double(Math.random() * 256).intValue(), new Double(Math.random() * 256).intValue());

	public GravityBall() {

	}

	@Override
	public void tick(List<Ball> coll) {
		for (Ball b : coll) {
			if (b instanceof BouncyBall) {
				double r = Math
						.sqrt((this.x - b.getX()) * (this.x - b.getX()) + (this.x - b.getX()) * (this.y - b.getY()));
			}
		}
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

	@Override
	public double getWidth() {
		return diameter;
	}

}
