package tw.com.eeit.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestCreateSession
 */
@WebServlet("/TestCreateSession.do")
public class TestCreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session = request.getSession();
//			session.getId();
			System.out.println(session.getId());
			response.setContentType("Text/plain;charset=UTF-8");
			response.getWriter().write("你的ID是: "+session.getId());
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
