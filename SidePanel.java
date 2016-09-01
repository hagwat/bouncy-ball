import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class SidePanel extends JPanel {

	public SidePanel() {
		setPreferredSize(new Dimension(230, 470));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		System.out.println(getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight());

		g.setColor(Color.BLUE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
