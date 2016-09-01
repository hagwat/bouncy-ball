import java.util.List;

/**
 * Controls actions relating to the internal state
 */
public class Model {

	private State state = new State();
	private Ball current;

	private static final int CYCLE_LENGTH = 25;
	private int cycle = CYCLE_LENGTH;

	public Model() {
		for (int i = 0; i < 5; i++) {
			add(current = new BouncyBall());
		}
	}

	public void tick() {

		List<Ball> coll = state.getCollection();

		if (cycle > 0) {
			cycle = cycle - 1;
		} else {
			cycle = CYCLE_LENGTH;
			coll.add(new BouncyBall());
		}

		for (Ball d : coll) {
			d.tick(coll);
		}
/*
		for (Drawable d : coll) {
			if (d.getX() > 300) {
				coll.remove(d);
			}
		}
*/
	}

	public void add(Ball d) {
		state.getCollection().add(d);
	}

	public State getState() {
		return state;
	}
}
