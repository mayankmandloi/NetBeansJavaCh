/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author web-bhumi
 */
public class TestClass {
    private static int count;
    private int sNo;
    public TestClass()
    {
        count++;
        sNo=count;
    }
    static void printCount()
    {
        System.out.println(count);
    }
    void printSNo()
    {
        System.out.println(sNo);
    }
}
