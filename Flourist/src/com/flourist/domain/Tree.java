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
public class Tree extends AbsArticle{
    
    protected double height;

    public Tree(String name, double price, double height) throws Exception {
        super(name, price);
        this.height=height;
    }

    @Override
    public String toString() {
        return "\nTree{" + "name=" + name + ", price=" + price + ", height=" + height + '}';
               
 
    }
    
    
}
