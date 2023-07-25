package tw.com.eeit.api.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		context.setAttribute("root", context.getContextPath());
	
		System.out.println("伺服器初始化.....");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("伺服器銷毀.....");
	}

}
