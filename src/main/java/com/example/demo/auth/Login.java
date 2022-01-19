package com.example.demo.auth;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.example.demo.model.Users;

@Component
public class Login extends SavedRequestAwareAuthenticationSuccessHandler {

   @Override
   public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
           Authentication authentication) throws ServletException, IOException {

       Users userDetails = (Users) authentication.getPrincipal();
        
       String redirectURL = request.getContextPath();
        
       if (userDetails.hasRole("Admin")) {
           redirectURL = "index.html";
       } else if (userDetails.hasRole("User")) {
           redirectURL = "indew.html";
       } 
       int m = (int) userDetails.getUserId(); 
       

       response.sendRedirect(redirectURL);
        
   }

}