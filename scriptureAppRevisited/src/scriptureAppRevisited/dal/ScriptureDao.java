package scriptureAppRevisited.dal;

import java.util.List;

import scriptureAppRevisited.bll.Scripture;

public interface ScriptureDao {
	boolean createScripture(Scripture newScripture);
	Scripture getScripture(int scriptureId);
	List<Scripture> getAllScriptures();
}
