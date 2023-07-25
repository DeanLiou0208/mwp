package tw.com.eeit.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestUpdateCookie
 */
@WebServlet("/TestUpdateCookie.do")
public class TestUpdateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		for(Cookie c : cookies) {
			if("MyName".equals(c.getName())) {//用MyName去做equals才不會容易變成Null.equals
				System.out.println(c.getName());
				c.setValue("Jim");
				response.addCookie(c);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
