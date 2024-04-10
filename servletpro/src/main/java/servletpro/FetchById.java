package servletpro;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.StudentDao;
import dto.StudentDto;
@WebServlet("/fetch")
public class FetchById extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		 System.out.println(cid);
    
		 
		 StudentDao studentDao=new StudentDao();
		 StudentDto studentDto=studentDao.fetchById(cid);
		 res.getWriter().print(studentDto);
	}

}
