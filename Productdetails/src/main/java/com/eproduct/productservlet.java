package com.eproduct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productservlet
 */
@WebServlet("/productservlet")
public class productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve the form data
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        // Set the data as request attributes
        request.setAttribute("name", name);
        request.setAttribute("price", price);

        // Forward the request to the JSP page for display
        request.getRequestDispatcher("productDetails.jsp").forward(request, response);
    }
	}

