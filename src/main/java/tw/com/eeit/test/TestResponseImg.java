package tw.com.eeit.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestResponseImg.do")

public class TestResponseImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 取得ID與設定圖片HOME
				String pID = request.getParameter("petID");
				final String PET_HOME = "C:\\Users\\User\\Desktop\\pets\\";

				// 取得回應物件
				response.setContentType("image/jpeg");
				ServletOutputStream out = response.getOutputStream();

				// 判斷使用者輸入的ID是否存在?
				File petHome = new File(PET_HOME);
				List<String> petNames = Arrays.asList(petHome.list());

				if (!petNames.contains(pID + ".jpg")) {
					FileInputStream fis = new FileInputStream(PET_HOME + "noimage.jpg");
					byte[] petPhoto = fis.readAllBytes();
					fis.close();
					out.write(petPhoto);
					return;
				}

				FileInputStream fis = new FileInputStream(PET_HOME + pID + ".jpg");
				byte[] petPhoto = fis.readAllBytes();

				fis.close();

				out.write(petPhoto);
				out.close();
//
//		FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\a.jpg");// 指向的地方不能直接只到Desktop要指到檔案
//
//		byte[] read = file.readAllBytes();
//		file.close();
//
//		response.setContentType("image/jpeg");// google mime type 去查type這樣就可以用複製的
//		ServletOutputStream out = response.getOutputStream();
//
//		out.write(read);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
