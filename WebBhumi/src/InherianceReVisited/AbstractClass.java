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
    String name;
    abstract void printName();
    void setName(String name)
    {
        this.name = name;
    }

}

interface AnInterface
{
    static int a=10;
    int b=20;
    void printName();
    
    
}
public abstract class AbstractClass extends ActualAbstractClass 
{

    final int a=29 ;

 
 

}
