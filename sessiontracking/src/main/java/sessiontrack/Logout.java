package sessiontrack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 @WebServlet("/logout")
public class Logout extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		HttpSession session=req.getSession();
		String un=(String)session.getAttribute("01");
		if(un==null) {
			resp.getWriter().print("Successfully logout");
		}
		else {
			resp.getWriter().print("Wrong Valied");
		}
	}

}
