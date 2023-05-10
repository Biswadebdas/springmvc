package com.nagarro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.constant.Credentials;
import com.nagarro.dao.UserDao;
import com.nagarro.model.User;

public class UserController {
   @SuppressWarnings("unused")
private Credentials us;

   public UserController(Credentials us) {
      this.us = us;
   }

	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
      String username = request.getParameter("username");
      String password = request.getParameter("password");
    
      if (Credentials.USERNAME == username && Credentials.PASSWORD==password) {
    
        response.sendRedirect("index.jsp");
        
      } else {
         
          response.sendRedirect("login.jsp?error=invalid_credentials");
      }
   }

  
}
