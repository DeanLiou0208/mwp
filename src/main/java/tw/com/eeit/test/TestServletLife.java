package tw.com.eeit.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletLife
 */
@WebServlet(urlPatterns = "/TestServletLife.do")
public class TestServletLife extends HttpServlet {
	private static final long serialVersionUID = 1L;
//		@Override
//		public void init() throws ServletException { //servlet 在接受第一次請求的時候才被建立!,若只是啟動server是不會被建立
//			System.out.println("Servlet on!");
//		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, String myAge) throws ServletException, IOException {
		String myAge1 = getInitParameter("myAge");
		System.out.println("我的年齡是: "+ myAge1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
//	@Override
//	public void destroy() { //
//		System.out.println("Servlet off!");
//	}

}
