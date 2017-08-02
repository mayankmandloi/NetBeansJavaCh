/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InherianceReVisited;

/**
 *
 * @author web-bhumi
 */
abstract class Demo
{
    abstract void test();
}



public class BinaNaamKiClass {
    public static void main(String[] args) {
        Demo d = new Demo()
        {
            void test()
            {
                System.out.println(".test()");
            }
        };
        d.test();
    }
}
