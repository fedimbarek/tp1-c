package isetj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class CompteurServlet
 */
@WebServlet("/CompteurServlet")
public class CompteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession();
	      Integer c = (Integer)s.getAttribute("A");
	      if (c == null) {
	        c = new Integer(1);
	      } else {
	        c = new Integer(c.intValue() + 1);
	      }
	      s.setAttribute("A", c);
	   
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>CompteurServlet</title></head>");
	      out.println("<body>");
	      out.println("<h1><font color='red'>CompteurServlet</h1>");
	      out.println("<p> La valeur du compteusr doit être " + c.intValue() + "</p>");
	      out.println("</body>");
	      out.println("</html>");
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
