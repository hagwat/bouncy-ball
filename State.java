import java.util.ArrayList;
import java.util.List;


/**
 * Stores information about the internal state.
 */
public class State {

	private List<Ball> collection = new ArrayList<Ball>();

	public List<Ball> getCollection() {
		return this.collection;
	}
}
