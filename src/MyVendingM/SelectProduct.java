/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyVendingM;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author Velizar
 */
public class SelectProduct implements lookmenu{
    
    Basket basket;
    
    public SelectProduct(Basket basket) {
       this.basket = basket; 
    }
   
  
  public  double sum ;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


  
   
     java.util.Scanner scan = new java.util.Scanner(System.in);
      ArrayList bascet = new ArrayList();
    public SelectProduct() {
        
     
    }
   public void ProductMenu (){
       System.out.println("[1] mars   " + "  [2] Corny    " + " [3] Baunty" + "[4] Twix");
       System.out.println("[5] CocaCola "+"[6] Schweppes " + "[7] Neste " + "[8] SanBenede ");
       System.out.println("[9] water  " + "  [0] " );
       System.out.print("num : ");
       System.out.println("");
       
       int num = scan.nextInt();
        switch (num){
            case 1 : Mars mars = new Mars();
               
            mars.Info();
             System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
             int   b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(mars,1);
                     sum = sum + mars.price;
                }
                else {
                    ProductMenu ();
                }
            
         
                    break;
            case 2 : Corny corny = new Corny();
            corny.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(corny,2);
                      sum = sum + corny.price;
                }
                else {
                    ProductMenu ();
                }
            
            
            
            break;
            case 3 : Baunty baunty = new Baunty();
            baunty.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(baunty,3);
                      sum = sum + baunty.price;
                }
                else {
                    ProductMenu ();
                }
            
            break;
            case 4 : Twix twix = new Twix();
            twix.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(twix,4);
                      sum = sum + twix.price;
                }
                else {
                    ProductMenu ();
                }
            break;
             case 5 : CocaCola CocaCola = new CocaCola();
            CocaCola.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(CocaCola,5);
                      sum = sum + CocaCola.price;
                }
                else {
                    ProductMenu ();
                }
            break;
            case 6 : Schweppes Schweppes = new Schweppes();
            Schweppes.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(Schweppes,6);
                      sum = sum + Schweppes.price;
                }
                else {
                    ProductMenu ();
                }
            break;
            case 7 : Neste Neste = new Neste();
            Neste.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(Neste,7);
                      sum = sum + Neste.price;
                }
                else {
                    ProductMenu ();
                }
            break;
            case 8 : SanBenede SanBenede = new SanBenede();
            SanBenede.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(SanBenede,8);
                      sum = sum + SanBenede.price;
                }
                else {
                    ProductMenu ();
                }
            break;
              case 9 : Water water = new Water();
            water.Info();
            System.out.println("Да добавяли в кошницата? ");
                System.out.println("[1] Да" + "[2] Не");
                b = scan.nextInt();
                if (b == 1){
                     basket.addProduct(water,9);
                      sum = sum + water.price;
                }
                else {
                    ProductMenu ();
                }
            break;
              case 0 : 
              
                  lookmenu(); break;
        }
        System.out.println("Show basket" + "\n[1] Yes [2] No");
         int     c = scan.nextInt();
              if (c==1){
                 
                      System.out.println(bascet.toString());
                      System.out.println( "sum "+sum);
                      
                      
                  
                 
              } else {
                         System.out.println("Add Product"+ "\n [1] Yes  [2] No"); 
                      int   h = scan.nextInt();
                         if (h == 1){
                             ProductMenu ();
                         }
                         else {
                             lookmenu();
                         }
                         
                          }
   }

    @Override
    public void lookmenu() {
        //To change body of generated methods, choose Tools | Templates.
    }
   
}
