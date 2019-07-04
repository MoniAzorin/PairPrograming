/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flourist.domain;

import java.util.UUID;
import static java.util.UUID.randomUUID;

/**
 *
 * @author azorin
 */
public abstract class AbsArticle {
    
    protected UUID id;
    protected String name;
    protected double price;

    public AbsArticle( String name, double price) throws Exception {
        if(name==null){
            throw new Exception();
        }
        if(price<=0){
            throw new Exception();
        }
        this.id =randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbsArticle{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
}
