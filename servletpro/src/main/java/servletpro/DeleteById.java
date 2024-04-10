package servletpro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/delid")
public class DeleteById extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
	String id=req.getParameter("id");
	int cid=Integer.parseInt(id);
	 System.out.println(cid);
	 StudentDao studentDao=new StudentDao();
	String studentDto=studentDao.deleteById(cid);
	 resp.getWriter().print(studentDto);

}
}
