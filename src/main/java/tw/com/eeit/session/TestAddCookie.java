package tw.com.eeit.session;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestAddCookie.do")
public class TestAddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie1 = new Cookie("MyName", "Dean");
		Cookie cookie2 = new Cookie(URLEncoder.encode("我的年齡", "UTF-8"), "十八歲");
		//cookie 在預設的情況下name是不能加入中文的,需要使用URLencoder去做編碼,但不編碼的情況下value是可以打中文的
		
		cookie1.setMaxAge(180);
		//setMaxAge 裡面放的數字是秒數, cookie 預設看到的時間是格林威治時間,要換算成台灣時間要+8或者是提前作換算。
		cookie2.setHttpOnly(true);
		//預設是false 更改為true的話就是設定成只有http可以發送cookie
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
