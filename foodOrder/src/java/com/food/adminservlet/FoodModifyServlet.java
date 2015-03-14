/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.adminservlet;

import com.foodbucket.foodModel.FoodBL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IshanFX
 */
public class FoodModifyServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        
        FoodBL bkfood = new FoodBL();
        bkfood.setFoodId(Integer.parseInt(request.getParameter("modiid")));
        bkfood.setFoodDesc(request.getParameter("modidesc"));
        bkfood.setFoodPrice(Double.parseDouble(request.getParameter("modiprice")));
        
        int chk = bkfood.modifyFoodItems();
        if(chk==1){               
            response.sendRedirect("food.jsp#profile");
        }
            
        else{
            response.sendRedirect("food.jsp#profile#errorModel");
        }
        
        
        
        
        }
        
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
