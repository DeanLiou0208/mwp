package tw.com.eeit.test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CreataListAndGoToJSP.do")
public class CreataListAndGoToJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		ArrayList<String> petList = new ArrayList<String>();
		petList.add("小白");
		petList.add("小黑");
		petList.add("小綠");
		petList.add("小黃");
		petList.add("小橙");
		petList.add("小藍");
		
//		
//		ServletContext context = getServletContext();
//		context.setAttribute("pList", petList);
//		response.sendRedirect("WEBPET/ShowList.jsp");
//		HttpSession session = request.getSession();
//		session.setAttribute("pList", petList);
		
		request.setAttribute("pList", petList);
		request.getRequestDispatcher("WEBPET/ShowList.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
