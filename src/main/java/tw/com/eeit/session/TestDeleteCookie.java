package tw.com.eeit.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDeleteCookie.do")
public class TestDeleteCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Cookie[] cookies = request.getCookies();
			
			for(Cookie c : cookies) {
				if("MyName".equals(c.getName())) {
					c.setMaxAge(0);
					response.addCookie(c);
					//對cookie做任何異動後 最後都加入到cookie才會做更新
				}
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
