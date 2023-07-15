package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecommerce.eproduct;

@WebServlet("/Eproductdao")
public class Eproductdao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				String productname = request.getParameter("txtproductname");
					float salary = Float.parseFloat(request.getParameter("txtsalary"));
					
					
					eproduct ep=new eproduct();
					
					ep.setproductname(productname);
					ep.setprice(price);
					
					//activate Connection with database
					SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
					// Require to start session
					Session session = sessionFactory.openSession();
					//Transaction start
					session.beginTransaction();
					//insert a record-->
					int i = (Integer) session.save(ep);
					//save changes in database permanently
					session.getTransaction().commit();
					//check for save
					PrintWriter out = response.getWriter();
					if (i > 0)
						out.println("Record inserted");
					else
						out.println("Record not inserted");

					
		
	}

}
