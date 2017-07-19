/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPackage;

/**
 *
 * @author web-bhumi
 */
public class TestString {
    public static void main(String[] args) {
        String s = "b";
        String t = "Web BHumi";
        String u = new String("a");
        t = t.concat(" Indore");
        System.out.println(u.equals(s));
        System.out.println(u.compareTo(s));
        
        
    }
}
