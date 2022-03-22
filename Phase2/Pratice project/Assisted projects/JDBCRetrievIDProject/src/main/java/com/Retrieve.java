package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.DBConnection;

@WebServlet("/Retrieve")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String pid=request.getParameter("pid");	 
	        // Try block to check exceptions
	        try {
	        	DBConnection conn = new DBConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
	            // Step 4: Write a statement
	        	String sql="select * from product_table where id=1";
	 
	            // Step 5: Execute the query
	        	Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	   
	        	 ResultSet rs = stmt.executeQuery(sql);
	 
	            // Step 6: Process the results
	            System.out.println( "id\t\name\t\salary");
	               
	 
	            // Condition check using next() method
	            // Holds true till there is single element remaining
	          // in the object
	            if (rs.next()) {
	               
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String salary = rs.getString("salary");
	              // Print and display name, emailID and password
	              System.out.println(id + "\t\t" + name
	                                   + "\t\t"+salary);
	            }
	        }
	 
	        // Catch block to handle exceptions
	        catch (ClassNotFoundException e) {
                e.printStackTrace();
                }
	        catch (SQLException e) {
	 
	            // Print the exception
	            System.out.println(e);
	        }
	    }
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}