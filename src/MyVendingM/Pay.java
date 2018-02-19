/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyVendingM;

import java.util.Scanner;

/**
 *
 * @author Velizar
 */
public class Pay extends PenetrateMoney {
    SelectProduct pr = new SelectProduct();
    Basket basket;
    
    
    public Pay(Basket basket) {
        this.basket = basket;
    }
    
    public void pay(){
        Scanner scan = new Scanner(System.in);
        System.out.println("money : ");
        System.out.println("Do you wont to penetrate money?");
        System.out.println("[1] Yes  [2] No");
        
        double basketTotal = basket.total();
        
        int a = scan.nextInt();
        if (a==1){
            penetrateMoney();
            
        }
        else {
            if(true){
                System.out.println("Successful");
                System.out.println("reset: "+ true);
                basket.clear();
                
                
            }
            else{
                System.out.println("your money not' enough"+ "\n Need: "+(true)+"\n Do you wont to penetrate money? ");
                  System.out.println("[1] Yes  [2] No");
                int b = scan.nextInt();
                 if (b==1){
            penetrateMoney();
            }
                 else{
                     basket.clear();
                      lookmenu();
                 }
                    
                 }
        }
    }
}
