/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodbucket.foodModel;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.food.managecls.DBConn;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author IshanFX
 */
public class FoodBL extends FoodBean implements FoodManage {

    private ResultSet rst;
    private PreparedStatement pstmt;
    private Statement stmt;
    
    public FoodBL() {
        
    }
    

    @Override
    public int addFoodItems(FoodBean food) {
        int chk = 0;
         try {
             InputStream stream = food.getFoodimage().getInputStream();
        String sql= "INSERT INTO food_tbl(foodid,foodname,foodprice,fooddesc,foodstatus,foodcategory,foodimg) VALUES('"+food.getFoodId()+"','"+food.getFoodName()+"','"+food.getFoodPrice()+"','"+food.getFoodDesc()+"','"+ food.getFoodstatus()+"','"+food. getFoodCateg()+"','"+stream+"')";
            chk = new DBConn().executeQuery(sql);          
        } catch (Exception ex) {
            Logger.getLogger(FoodBL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return chk;
    }

    @Override
    public int modifyFoodItems() {
        int chk = 0;
        String sql = "UPDATE food_tbl set fooddesc=?,foodprice=? WHERE foodid='"+getFoodId()+"'";
        try {
            pstmt = DBConn.dbConn().prepareStatement(sql);
            pstmt.setString(1, getFoodDesc());
            pstmt.setDouble(2,getFoodPrice());
            chk = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FoodBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }

    @Override
    public int removeFoodItems() {
        int chk=0;
       
       try {
            stmt = DBConn.dbConn().createStatement();
            chk = stmt.executeUpdate("UPDATE Food_tbl set foodstatus='D' WHERE foodid='"+getFoodId()+"'");
        } catch (SQLException ex) {
            chk=10;
        }
       return chk;
    }
     
    public ResultSet getFoodDetails(){
        String sql = "SELECT foodid,foodname,foodprice,fooddesc,foodstatus,foodcategory FROM food_tbl";
        try {
            stmt = DBConn.dbConn().createStatement();
            rst = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(FoodBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rst;
    }
    
    
    
   
}
