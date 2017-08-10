/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbhumi;

/**
 *
 * @author web-bhumi
 */
public class Test {
 
    String inp;
    Test (String s)
    {
        inp=s;
    }
    public String toString()
    {
        return inp;
    }
    public static void main(String[] args) {
        
        String t=new String("56");
        System.out.println(t);
        Test t1 = new Test("Adarsh");
        System.out.println(t1);
        
    }
}
