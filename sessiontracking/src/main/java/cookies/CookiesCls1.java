package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/c1")
public class CookiesCls1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String s1=req.getParameter("sname");
		String s2=req.getParameter("spwd");
		System.out.println("class1 "+s1+" "+s2);
		
		Cookie cookie1=new Cookie("k1", s1);
		Cookie cookie2=new Cookie("k1", s1);
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		
		resp.getWriter().print("<a href='c2'>Go for c2</a>");
		
	}

}
