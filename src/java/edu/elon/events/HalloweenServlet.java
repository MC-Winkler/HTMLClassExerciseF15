/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.events;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Michael
 */
@WebServlet(name = "HalloweenServlet", urlPatterns = {"/goelon"})
public class HalloweenServlet extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    
    this.getServletContext().getRequestDispatcher("/index.html").forward(request, response);
  }


  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {  
    
    System.out.println("First name: " + request.getParameter("firstname"));
    System.out.println("Last name: " + request.getParameter("lastname"));
    System.out.println("Email : " + request.getParameter("email"));
    System.out.println("ZIP Code: " + request.getParameter("zip"));
    
    this.getServletContext().getRequestDispatcher("/subscribe.html").forward(request, response);
  }


}
