package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewrecords")
public class viewrecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//Call Connection method
			Connection con=DBConnection.getConnection();
			//Write sql command
			String query="select * from eproduct";
			//to execute sql command create Statement Object
			Statement stmt=con.createStatement();
			//get Result
			ResultSet rs=stmt.executeQuery(query);
			
			//display result in html page
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr>"
					+ "<th>product_id</th>"
					+ "<th>p_name</th>"
					+ "<th>price</th>"
					+ "</tr>");
			while(rs.next()) {
				out.println("<tr>");
				out.print(	"<td>"+rs.getInt("product_id")+"</td>");
				out.print("<td>"+rs.getString("p_name")+"</td>");
				out.print("<td>"+rs.getFloat("price")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	}


