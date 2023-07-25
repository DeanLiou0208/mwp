package tw.com.eeit.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RealPath.do")
public class RealPath extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String realPath = getServletContext().getRealPath("a.jpg");
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\pets\\a.jpg");
	byte[] photo = fis.readAllBytes();
	fis.close();
	
	FileOutputStream fos = new FileOutputStream(realPath);
	fos.write(photo);
	fos.close();
	response.getWriter().write("Done!!");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
