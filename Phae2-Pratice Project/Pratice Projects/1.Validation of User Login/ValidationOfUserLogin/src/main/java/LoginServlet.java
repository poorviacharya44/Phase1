

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
        PrintWriter pw= response.getWriter(); 
        RequestDispatcher rd1 = request.getRequestDispatcher("Dashboard");	// target is servlet page 
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html"); //target page is index page
		
        try {
		if(emailId.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("Successfully login");
			rd1.forward(request, response); //we can see output of only target page
		}else {
			pw.println("Failure try once again");
			rd2.include(request, response);  //we can see error page+ index page as output
		}
        }catch(Exception e){
        	pw.println(e);
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
