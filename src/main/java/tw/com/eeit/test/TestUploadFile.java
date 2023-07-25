package tw.com.eeit.test;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.coyote.http11.filters.BufferedInputFilter;

@WebServlet("/TestUploadFile.do")
@MultipartConfig( location = "C:\\Users\\User\\Desktop\\",maxFileSize = 1024)
public class TestUploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		使用part介面的方法
		  Part part = request.getPart("ufile"); 
		  part.write(part.getSubmittedFileName());
		
//		取得byte[]的方法:
//		Part part = request.getPart("ufile");//part 可以接收上傳的檔案
//		BufferedInputStream bis = new  BufferedInputStream(part.getInputStream());
//		byte[] photo = bis.readAllBytes();
//		bis.close();
//		
//		String fileName = part.getSubmittedFileName();
//		response.getWriter().write("Done!!!");
//		
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\"+fileName);
//		fos.write(photo);
//		fos.close();
//		System.out.println("Done!!!");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
