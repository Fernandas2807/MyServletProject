package sessiontrack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Homepage")
public class Homepage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
	String	un=(String)session.getAttribute("01");
	String	pwd=(String)session.getAttribute("02");
	resp.getWriter().print("hii it's me"+" "+un);
	
	
	session.invalidate();
	resp.setContentType("text/html");
	resp.getWriter().print("<a href='logout'>Logout</a>");
	
	session.setMaxInactiveInterval(60);
	}

}
