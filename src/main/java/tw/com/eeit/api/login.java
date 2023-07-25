package tw.com.eeit.api;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.eeit.api.been.Emp;

@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String CONN_URL = "jdbc:sqlserver://localhost:1433;databaseName=java;user=sa;password=P@ssw0rd;trustservercertificate=true";
		String userName = request.getParameter("account");
		String reMind = request.getParameter("rm");
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(CONN_URL);
			PreparedStatement pret = conn.prepareStatement("SELECT * FROM emp WHERE empname=?");
			pret.setNString(1, userName);
			ResultSet rs = pret.executeQuery();

			if (rs.next()) {
				Emp e = new Emp();
				e.setEmpid(rs.getInt(1));
				e.setEmpname(rs.getString(2));
				e.setSalary(rs.getInt(3));
				e.setSex(rs.getString(4));
				e.setDeptid(rs.getInt(6));

				HttpSession session = request.getSession();
				session.setAttribute("loggedInEmp", e);
				
				if(reMind!=null) {
					int lifeTime = 60*60*24*7;
					session.setMaxInactiveInterval(lifeTime);
					 Cookie c = new Cookie("JSESSIONID",session.getId());
					 c.setMaxAge(lifeTime);
					 response.addCookie(c);
				}
				
				
				response.sendRedirect("ShowInfo.jsp");
				
				System.out.println(e);

				return;
			}
			response.setHeader("refresh", "3;URL=Login.html");
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("登入失敗,3秒後導向登入畫面...");

			rs.close();
			pret.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
