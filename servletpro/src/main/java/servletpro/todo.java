package servletpro;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.StudentDao;
import dto.StudentDto;


@WebServlet("/form")
public class todo implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id1=req.getParameter("id");
		String name1=req.getParameter("name");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		String pnumb=req.getParameter("pno");
		String gender=req.getParameter("gender");
		String country=req.getParameter("state");
//		res.getWriter().print(id);
//		res.getWriter().print(user);
		
		StudentDto SDTO=new StudentDto();
		int cid=Integer.parseInt(id1);
		Long pnum=Long.parseLong(pnumb);
		 
		SDTO.setId(cid);
		SDTO.setName(name1);
		SDTO.setEmail(email);
		SDTO.setDob(dob);
		SDTO.setPnumber(pnum);
		SDTO.setGender(gender);
		SDTO.setstate(country);
		System.out.println(SDTO);
		 
		 StudentDao SDAO=new StudentDao();
		 String msg=SDAO.insertdata(SDTO);
		 res.getWriter().print(msg);
		
		
		
		
		
		
		
	}

}
