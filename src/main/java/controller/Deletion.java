package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;

@WebServlet("/ghi")
public class Deletion extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1 = req.getParameter("pid");
		int pid = Integer.parseInt(s1);
		
		Patientdao patientdao= new Patientdao();
		patientdao.delete(pid);
	}

}
