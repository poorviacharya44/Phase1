
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		out.print("<h1>Display the Record</h1>");
		out.print("<table border='1'><tr><th>P_Id</th><th>P_Name</th><th>Price</th></tr>");
		
		try {
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","Root@1999");
	      Statement st=  dbCon.createStatement();
	      ResultSet rs =st.executeQuery("select * from product where p_id="+id+"");
	  
	      while(rs.next()) {
	    	  
	    	  out.print("<tr><td>");
	    	  out.println(rs.getInt(1));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(2));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getInt(3));
	    	  out.print("</td>");
	    	  out.print("</tr>");
	     	  
			}
	      
		}catch (ClassNotFoundException e) {
            e.printStackTrace();
    } catch (SQLException e) {
            e.printStackTrace();	
	}
		out.print("</table>");
	
}
}
