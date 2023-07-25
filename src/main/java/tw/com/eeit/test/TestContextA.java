package tw.com.eeit.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestContextA.do")
public class TestContextA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			ArrayList<String> petList =  new ArrayList<String>();
			petList.add("小黑");
			petList.add("小白");
			petList.add("MAX");
			petList.add("PETER");
			petList.add("123");
			
			ServletContext context = getServletContext();
			context.setAttribute("pList", petList);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
