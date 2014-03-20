package scriptureAppRevisited.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scriptureAppRevisited.bll.Scripture;
import scriptureAppRevisited.dal.DaoFactory;
import scriptureAppRevisited.dal.JdbcScriptureDao;
import scriptureAppRevisited.dal.ScriptureDao;

/**
 * Servlet implementation class ShowScriptures
 */
@WebServlet("/ShowScriptures")
public class ShowScriptures extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowScriptures() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ScriptureDao scriptureDao = new DaoFactory().getScriptureDao();
		
		List<Scripture> scriptures = scriptureDao.getAllScriptures();
		
		request.setAttribute("scriptures", scriptures);
		request.getRequestDispatcher("scriptureList.jsp").forward(request, response);
	}

}
