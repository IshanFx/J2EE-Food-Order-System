/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.order;

import java.sql.ResultSet;

/**
 *
 * @author IshanFX
 */
public interface OrderInterface {
    void addOrder();
    ResultSet getOrderDetails();
    int changeOrderStatus();
}
