package scriptureAppRevisited.dal;

public class DaoFactory {
	public ScriptureDao getScriptureDao() {
		return new JdbcScriptureDao();
	}
}
