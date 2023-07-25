package tw.com.eeit.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.api.ConnectionFactory;

@WebServlet("/TestConnetionPool")
public class TestConnetionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  try {
		
		Connection conn = ConnectionFactory.getConnection();
		
		PreparedStatement prepSt = conn.prepareStatement("SELECT * FROM emp");
		ResultSet rs = prepSt.executeQuery();
		
		if(rs.next()) {
			String string = rs.getString("empname");
			System.out.println(string);
		}
		
		rs.close();
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
