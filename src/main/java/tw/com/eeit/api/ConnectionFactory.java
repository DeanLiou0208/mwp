package tw.com.eeit.api;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {

	public static  Connection getConnection() {

		try {
			InitialContext initialContext = new InitialContext();
			DataSource ds = (DataSource) initialContext.lookup("java:comp/env/jdbc/SSMSQL");
			Connection conn = ds.getConnection();

			return conn;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}

}
