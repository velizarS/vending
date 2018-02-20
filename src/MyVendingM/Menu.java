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
public class Menu implements lookmenu , ProductMenu, PenetrateMoney$ {
    
    public void lookmenu(){
        
        Basket basket = new Basket();
        Scanner scan = new Scanner(System.in);
        
         for(;;){
             int select;
             System.out.println("money : " + penetrateMoney());
        System.out.printf("[1] select product"+ "       [2] penetrate money\n");
        System.out.printf("[3] Pay"+ "                  [4] exit");
            System.out.print("\nSelect : ");
        select  = scan.nextInt();
        if(select == 1){
            SelectProduct product = new SelectProduct(basket);
            product.ProductMenu();
        }
        else if (select == 2){
            PenetrateMoney penetrate = new PenetrateMoney();
            penetrate.penetrateMoney();
        }
         else if (select == 3){
           Pay Pay = new Pay(basket);
           Pay.pay();
        }
         else if (select == 4){
            
            break;
            }
        }
    
        }

    @Override
    public void ProductMenu() {
       
    }

    @Override
    public double penetrateMoney() {
        return 0;
    }
    }

  
    




