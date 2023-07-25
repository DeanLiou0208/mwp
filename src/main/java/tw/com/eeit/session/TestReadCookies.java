package tw.com.eeit.session;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestReadCookies
 */
@WebServlet("/TestReadCookies.do")
public class TestReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {//(參用型態 參用 : 指定陣列參用)
			System.out.println(URLDecoder.decode(c.getName(), "UTF-8"));
			// 進行編譯的時候 英文仍然編譯為英文,所以編譯不會出錯。
			System.out.println(c.getValue());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
