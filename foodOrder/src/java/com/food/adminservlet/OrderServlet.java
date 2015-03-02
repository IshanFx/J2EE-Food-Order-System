/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.adminservlet;

import com.food.order.NormalOrder;
import com.food.order.SpecialOrder;
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
public class OrderServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        NormalOrder norder = new NormalOrder();
        SpecialOrder sorder = new SpecialOrder();
        int chk = 0;
        try{
        if(!(request.getParameter("specialFood")==null)){
            out.println(request.getParameter("specialFood"));
            sorder.setOrderId(Integer.parseInt(request.getParameter("specialFood")));
            chk = sorder.changeOrderStatus();
            out.println(chk);
        }        
        
        else if(!(request.getParameter("normalFoodOrder")==null)){
            out.println(request.getParameter("normalFoodOrder"));
            out.println(request.getParameter("normalfood"));
            norder.setOrderId(Integer.parseInt(request.getParameter("normalFoodOrder")));
            norder.setOrderFoodId(Integer.parseInt(request.getParameter("normalfood")));
            chk = norder.changeOrderStatus();
             out.println(chk);
            }
        }
        catch(Exception ex){
            out.println("errrrr");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
