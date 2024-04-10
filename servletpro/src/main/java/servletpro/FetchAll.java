package servletpro;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDto;


@WebServlet("/fetchall")
public class FetchAll extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
	StudentDao studentDao=new StudentDao();
	List<StudentDto> list=studentDao.fetchAll();
	//resp.getWriter().print(list);
	
	req.setAttribute("Object", list);
	
	
	RequestDispatcher rd=req.getRequestDispatcher("fetch.jsp");
	rd.forward(req, resp);
	
}
		
		
	}


