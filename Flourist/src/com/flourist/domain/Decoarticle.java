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
public class Decoarticle extends AbsArticle {
    
    protected Material material;

    public Decoarticle(String name, double price,Material material) throws Exception {
        super(name, price);
        this.material = material;
    }
    
        @Override
    public String toString() {
        return "\nArticle Decoració{" + "name=" + name + ", price=" + price + ", material=" + material + '}';
               
 
    }
}
