import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements MouseListener {

	private static final Dimension PREF_SIZE = new Dimension(700, 500);
	private Control ctrl;
	private Canvas canvas;
	
	public Frame(Control ctrl) {
		super("Chicken Pox");
		
		this.ctrl = ctrl;
		
		setLayout(new BorderLayout());

		// centre window on screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width / 2) - (this.getPreferredSize().width / 2),
				(dim.height / 2) - (this.getPreferredSize().height / 2));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// addWindowListener(new WindowAdapter());

		addMouseListener(this);

		pack();

		// visibility
		setResizable(false);
		setVisible(true);
		
		// components
		//this.add(new SidePanel(), BorderLayout.EAST);
		this.add(canvas = new Canvas(ctrl), BorderLayout.CENTER);
	}

	@Override
	public Dimension getPreferredSize() {
		return PREF_SIZE;
	}
	
	public Control getCtrl(){
		return ctrl;
	}
	
	
	public Canvas getCanvas(){
		return canvas;
	}


	// MouseListener methods
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
