package scriptureAppRevisited.dal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import scriptureAppRevisited.bll.Scripture;

public class JdbcScriptureDao implements ScriptureDao {

	@Override
	public boolean createScripture(Scripture newScripture) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Scripture getScripture(int scriptureId) {
		// TODO Auto-generated method stub
		return null;
	}

	private final String DB_CONNECTION = "jdbc:mysql://localhost/scriptures";
	
	@Override
	public List<Scripture> getAllScriptures() {

		List<Scripture> list = new ArrayList<Scripture>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Properties prop = new Properties();
			prop.load(getClass().getResourceAsStream("/scriptureDbAccess.properties"));
			
			String user = prop.getProperty("dbUser");
			String pass = prop.getProperty("dbPassword");
			
			Connection conn = DriverManager.getConnection(DB_CONNECTION, user, pass);
			Statement statement = conn.createStatement();

			String sql = "SELECT * FROM scripture";
			
			ResultSet resultSet = statement.executeQuery(sql);
		
			while (resultSet.next()) {
				String book = resultSet.getString("book");
				int chapter = resultSet.getInt("chapter");
				int verse = resultSet.getInt("verse");
								
				list.add(new Scripture(book, chapter, verse));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	
	}

}
