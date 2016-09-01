
public class Timer extends Thread {

	private Control ctrl;
	private int timeout = 20;

	public Timer(Control ctrl) {
		this.ctrl = ctrl;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(timeout);
				ctrl.tick();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
