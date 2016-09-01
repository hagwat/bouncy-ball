
/**
 * Root of the program. Communicates between the model and the UI.
 */
public class Control {

	private Model model;
	private Timer timer;
	private Frame frame;
	
	public Control() {
		this.frame = new Frame(this);
		this.model = new Model();
		this.timer = new Timer(this);
		timer.run();
	}

	public static void main(String[] args) {
		new Control();
	}
	
	public void tick(){
		model.tick();
		frame.getCanvas().repaint();
	}

	public Model getModel(){
		return model;
	}
}
