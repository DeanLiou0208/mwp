package tw.com.eeit.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestRefresh.do")
public class TestRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("註冊成功,3秒後導向主頁");
		response.setHeader("Refresh", "3;URL=https://tw.yahoo.com/"); //3秒後重新整理
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
