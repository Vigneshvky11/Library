package com.servelts;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.dao.UserDao;
@WebServlet("/EditUserForm")
public class EditUserForm extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Edit user Form</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		UserBean bean=UserDao.viewById(id);
		
		out.print("<form action='EditUser' method='post' style='width:300px'>");
		out.print("<div class='form-group'>");
		out.print("<input type='hidden' name='id' value='"+bean.getUserId()+"'/>");
		out.print("<label for='name1'>Name</label>");
		out.print("<input type='text' class='form-control' value='"+bean.getFirstName()+"' name='firstName' id='name1' placeholder='First Name'/>");
		out.print("<input type='text' class='form-control' value='"+bean.getLastName()+"' name='lastName' id='name1' placeholder='Last Name'/>");
		out.print("</div>");
		out.print("<div class='form-group'>");
		out.print("<label for='mobile1'>Mobile Number</label>");
		out.print("<input type='number' class='form-control' value='"+bean.getPhoneNo()+"'  name='phoneNo' id='phoneNo1' placeholder='Phone No.'/>");
		out.print("</div>");
		out.print("<button type='submit' class='btn btn-primary'>Update</button>");
		out.print("</form>");
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
		
	}
}
