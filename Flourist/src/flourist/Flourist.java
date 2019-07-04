/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flourist;

import com.flourist.application.FlouristController;
import com.flourist.domain.Material;


/**
 *
 * @author azorin
 */
public class Flourist {

    private static FlouristController NovaFlourist = new FlouristController("Berenjena");
            
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        NovaFlourist.createTree("Avet", 34, 3.8);
        
        NovaFlourist.createDecoarticle("Estrella", 500, Material.FUSTA);
        

        NovaFlourist.createFlower("margarita", 4, "blanca");
        
        NovaFlourist.printStock();
    }
    

    
}
