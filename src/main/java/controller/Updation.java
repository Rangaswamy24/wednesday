package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
import dto.Patient;

@WebServlet("/def")
public class Updation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1 = req.getParameter("pid");
		int pid = Integer.parseInt(s1);
		
		String bg = req.getParameter("bg");
		
		Patientdao patientdao= new Patientdao();
		patientdao.update(pid, bg);
	}
}
