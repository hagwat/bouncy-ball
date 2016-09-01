import java.awt.Color;
import java.util.List;

public interface Ball {

	public void tick(List<Ball> coll);

	public double getX();

	public double getY();

	public Color getColor();

	public double getWidth();
}
