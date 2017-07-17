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
public class WebBhumi {

    /**
     * @param args the command line arguments
     */
    // public protected private "default"
// static "instance"==> objects's variable    
    static int a = 12;
    int b = 35;

    public static void main(String[] args) {
        // TODO code application logic here
        WebBhumi b1 = new WebBhumi();
        WebBhumi b2 = new WebBhumi();
        b2.b = 44;
        System.out.println(b1.b);
        b2.a = 10;
        System.out.println(b2.a);
        System.out.println(b1.a);

    }

}
//https://www.javatpoint.com/this-keyword
