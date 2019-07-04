/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flourist.persistence;

import com.flourist.domain.AbsArticle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author azorin
 */
public class StockFlourist {
    
    private static List<AbsArticle> articles = new ArrayList<>();

    public StockFlourist() {
    }
    
    public List<AbsArticle> getAllArticles(){
        return articles;
    }
    
    public void addArticle(AbsArticle article) throws Exception{
        if(article ==null){
            throw new Exception("No hay ningun articulo");
        }
        articles.add(article);
    }
    
}
