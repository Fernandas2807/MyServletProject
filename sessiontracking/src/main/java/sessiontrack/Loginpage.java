package sessiontrack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Loginpage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //super.doPost(req, resp);
		
		
		String un=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		HttpSession session=req.getSession();
		session.setAttribute("01", un);
		session.setAttribute("02", pwd);
		
		if(un.equals("dhanush")&&pwd.equals("0307")) {
			resp.getWriter().print("<a href='Homepage'>Home page</a>");
		}
		else {
			resp.getWriter().print("Please enter proper credentials");		}
	}

}
