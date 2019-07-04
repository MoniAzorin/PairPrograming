/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flourist.application;

import com.flourist.domain.AbsArticle;
import com.flourist.domain.Decoarticle;
import com.flourist.domain.Flower;
import com.flourist.domain.Material;
import com.flourist.domain.Tree;
import com.flourist.persistence.StockFlourist;
import java.util.List;

/**
 *
 * @author azorin
 */
public class FlouristController {
    
    private String nameFlourist;
    // Crear Floristeria
    
    private StockFlourist stock= new StockFlourist();
    
    public FlouristController(String name){
        this.nameFlourist=name;
    }
    
    // Afegir els fiferents Articles:
    
    public void createTree(String name, double price, double height) throws Exception{
        Tree tree = new Tree (name, price, height);
        stock.addArticle(tree);
        
    }
    
    public void createDecoarticle(String name, double price, Material material) throws Exception{
        Decoarticle decoarticle = new Decoarticle (name, price, material);
        stock.addArticle(decoarticle);
        
    }
    
   public void createFlower(String name, double price, String colour) throws Exception{
        Flower flower = new Flower (name, price, colour);
        stock.addArticle(flower);
        
    }
   
    public void printStock(){
        System.out.println( stock.getAllArticles().toString());
    }
    
    
}
