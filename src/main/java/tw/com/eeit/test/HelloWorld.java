package tw.com.eeit.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 */
//@WebServlet("*.do")
@WebServlet("/AAA/")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hello World!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

//ctrl + D = 刪除
//sysout =System.out.println 縮寫
//Alt + ? =提示
//Ctrl + + = 放大字體
//Ctrl + - = 縮小字體
//Ctrl + Alt + ↓ 複製當前選擇區
//Alt + ↑↓　＝　單行移動
//Ctrl + Shift + C = 註解　





