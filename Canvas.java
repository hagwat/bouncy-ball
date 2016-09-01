import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	private static final long serialVersionUID = -1354251777507926593L;
	private Control ctrl;

	public Canvas(Control ctrl) {
		super();
		setPreferredSize(new Dimension(470, 470));
		this.ctrl = ctrl;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBorder(g);
		paintObjects(g);
	}

	public void drawBorder(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(getX(), getY(), getWidth()-1, getHeight()-1);
	}

	public void paintObjects(Graphics g) {
		if (ctrl.getModel() == null) {
			System.out.println("not created yet");
			return;
		}
		List<Ball> list = ctrl.getModel().getState().getCollection();
		for (Ball d : list) {
			if (d instanceof BouncyBall) {
				int x = new Double(d.getX()).intValue();
				int y = new Double(d.getY()).intValue();
				int diameter = new Double(d.getWidth()).intValue();

				g.setColor(d.getColor());
				g.fillOval(x, y, diameter, diameter);

				g.setColor(Color.black);
				g.drawOval(x, y, diameter, diameter);

			}
		}
	}

}
