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
public class PenetrateMoney  implements lookmenu{
   double money;
    MyVending vend = new MyVending();
    
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    
    Scanner scan = new Scanner(System.in);
    public void penetrateMoney(){
        System.out.println("(0.05)(0.10)(0.20 )(0.50)(1.00)(2.00) лв.");
        System.out.println("Пример: 5,0.2 => 5*0,20");
        System.out.println("Enter Money : ");
        String enter = scan.nextLine();
        String[] arr = enter.split(",");
        convert(arr);
        System.out.println(penetratedMoney()+" лв");
        System.out.println("Желаете ли да вкарате още пари? "+ "\n[1] да [2] не");
        int a= scan.nextInt();
    if(a==1){
      penetrateMoney();
    }
    else {
        lookmenu();
    }
       
      
       
    }
    
   
     public  void convert(String [] arr){
       double [] convert = new double [arr.length];
        for (int i = 0; i < arr.length; i++) {
         
            convert[i]  =  Double.parseDouble(arr[i]); }
         money = convert[0]*convert[1];
       
}
    public double penetratedMoney( ){
        
        vend.penetratedMoney =  money;
        return vend.penetratedMoney;
    }
   

    @Override
    public void lookmenu() {
        
    }
    
   
}