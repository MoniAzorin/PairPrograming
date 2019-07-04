/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flourist.domain;

/**
 *
 * @author azorin
 */
public class Flower extends AbsArticle {
    
    protected String colour;

    public Flower(String name, double price, String colour) throws Exception {
        super(name, price);
        this.colour=colour;
    }
    
   @Override
    public String toString() {
        return "\nFlower{" + "name=" + name + ", price=" + price + ", colour=" + colour + '}';
               
 
    }
    
}
