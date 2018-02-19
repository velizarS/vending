/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyVendingM;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Velizar
 */
public class Basket {
    
    Map<Product, Integer> currentBasket = new HashMap<>();
    
    public void addProduct(Product newProduct, int id) {
        
        if(currentBasket.containsKey(newProduct)) {
            currentBasket.put(newProduct, currentBasket.get(newProduct) + id);
        } else {
            currentBasket.put(newProduct, id);
        }
    }
    
    public Map<Product, Integer> get() {
        return currentBasket;
    }


    public void clear() {
        currentBasket.clear();
    }
    
    public double total() {
        // TODO
        
        return 0d;
    }

}
