package com.servelts;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.dao.UserDao;
@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String phoneNo=request.getParameter("phoneNo");
		long mobile=Long.parseLong(phoneNo);
		UserBean bean=new UserBean(id,firstName, lastName, mobile);
		UserDao.update(bean);
		response.sendRedirect("ViewUser");
	}

}
