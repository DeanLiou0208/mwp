package tw.com.eeit.api.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")//任何檔案
public class TestFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		ArrayList<String> list = new ArrayList<>();
		list.add("/A.jsp");
		list.add("/BBB");
		list.add("/TestResquest.html");

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		if (list.contains(req.getServletPath())) {
			if (req.getSession().getAttribute("loggedInEmp") == null) {
				resp.sendRedirect("Login.html");
				return;
			}
		}

		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
