package kr.or.ddit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuffer html = new StringBuffer("<html>");
		html.append("<body>");
		html.append("<h4>hello~~~</h4>");
		html.append("</body>");
		html.append("</html>");
		try (
				PrintWriter out = resp.getWriter(); //closable 객체의 선언, try with resource 구문(java 1.7...)
				){
			
			out.println(html);
			
			
		}
		
	}

}
