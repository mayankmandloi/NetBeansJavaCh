/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
   class NewClass1
    {
        void showMe()
        {
            System.out.println("InnerClass.NewClass.NewClass1.showMe()");
        }
    }
   
   NewClass1 nc2 = new NewClass1();
   
   NewClass1 getObj(){
       return new NewClass1();
   }
   
   void showMe1()
   {
       System.out.println("InnerClass.NewClass.showMe()");
   }
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        NewClass1 nc1 = nc.getObj();
        nc1.showMe();
        nc.nc2.showMe();
        
        
    }
}
