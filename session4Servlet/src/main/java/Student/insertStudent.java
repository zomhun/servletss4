package Student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class insertStudent
 */
@WebServlet("/insertStudent")
public class insertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("stuId");
		String name = request.getParameter("stuName");
		Boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		String birthday = request.getParameter("birthday");
		String homeTown = request.getParameter("homeTown");
		String classs = request.getParameter("classs");
		String save = request.getParameter("save");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("stuId", id);
		session.setAttribute("stuName", name);
		session.setAttribute("gender", gender);
		session.setAttribute("birthday", birthday);
		session.setAttribute("homeTown", homeTown);
		session.setAttribute("classs", classs);
		
		if(save!=null && save.equals("save")) {
			Cookie cid = new Cookie("stuId", id);
			Cookie cname = new Cookie("stuName", name);
			Cookie cbirthday = new Cookie("birthday", birthday);
//			if(gender.equals("true")) {
				Cookie cgender = new Cookie("gender", "checked");
				response.addCookie(cgender);
//			}
			Cookie chomeTown = new Cookie("homeTown", homeTown);
			Cookie cclasss = new Cookie("classs", classs);
			Cookie csave = new Cookie("save","checked");
			
			response.addCookie(cid);
			response.addCookie(cname);
			response.addCookie(cbirthday);
			response.addCookie(chomeTown);
			response.addCookie(cclasss);
			response.addCookie(csave);
			
			response.sendRedirect("display.jsp");
		}else {
			Cookie cid = new Cookie("stuId", "");
			Cookie cname = new Cookie("stuName","");
			Cookie cbirthday = new Cookie("birthday", "");
			Cookie chomeTown = new Cookie("homeTown", "");
			Cookie cclasss = new Cookie("classs", "");
			Cookie csave = new Cookie("save","");
			
			response.addCookie(cid);
			response.addCookie(cname);
			response.addCookie(cbirthday);
			response.addCookie(chomeTown);
			response.addCookie(cclasss);
			response.addCookie(csave);
			
			response.sendRedirect("display.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
