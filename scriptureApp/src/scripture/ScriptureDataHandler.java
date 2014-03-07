package scripture;

import java.util.LinkedList;
import java.util.List;

public class ScriptureDataHandler {
	List<Scripture> getScriptures() {
		List<Scripture> scriptures = new LinkedList<Scripture>();
		scriptures.add(new Scripture("Proverbs", 3, 5));
		scriptures.add(new Scripture("Amos", 3, 7));
		scriptures.add(new Scripture("John", 7, 17));
		
		return scriptures;
	}
}
