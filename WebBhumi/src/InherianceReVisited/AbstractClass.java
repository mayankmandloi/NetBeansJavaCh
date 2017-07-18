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
abstract class ActualAbstractClass
{
    abstract void printName();

}

interface AnInterface
{
    final static int a=10;
    int b=20;
    void printName();
    
    
}
public class AbstractClass extends ActualAbstractClass implements AnInterface
{

    final int a=29 ;

    public void printName() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        AbstractClass ab = new AbstractClass();
        System.out.println(AnInterface.a);//10
        System.out.println(ab.a);//29
        ab.printName();
    }
 

}
