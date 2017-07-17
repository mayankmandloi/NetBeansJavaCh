/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbhumi;

import java.awt.SystemColor;

/**
 *
 * @author web-bhumi
 */
public class WebBhumi {
// public protected private "default"
// static "instance"==> objects's variable    
    static int a = 12;
    int b = 35;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(a);
        checkMe1();


        
//Q) New reffrence with name b1 of same class
//A) We cannot create two or more variable/reffrence with same name 
//   in same scope
    }
 /* 
    now we have two methods we area going to creata int a in both
    */
    
    static void checkMe1()
    {
        int a=10;
        System.out.println(WebBhumi.a);
       // System.out.println(this.b);
        
        
    }
    void checkMe2()
    {
        int b=16;
        System.out.println(b);
        System.out.println(this.b);
        
    }
    
    
    
    
    

}
