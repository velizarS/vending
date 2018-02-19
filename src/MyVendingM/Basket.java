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
    
    Map<Integer, Product> currentBasket = new HashMap<>();
    
    public void addProduct(Product newProduct, int id) {
        
        if(currentBasket.containsKey(id)) {
            currentBasket.put(id, newProduct);
        } else {
            currentBasket.put(id, newProduct);
        }
    }
    
    public Map<Integer, Product> get() {
        return currentBasket;
    }


    public void clear() {
        currentBasket.clear();
    }
    
   

    public double getPrices(){
        double sum=0;
        for (Integer key:currentBasket.keySet()) {
           sum=sum+currentBasket.get(key).getPrice();
        }
        return sum;
    }





}