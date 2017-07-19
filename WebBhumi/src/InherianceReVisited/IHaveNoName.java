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
interface CanYouCreateMyObject
{
    void showName();
}
public class IHaveNoName {
    
    
    
    
    public static void main(String[] args) {
        CanYouCreateMyObject can = new CanYouCreateMyObject() {public void showName(){}};
        CanYouCreateMyObject can2 = new CanYouCreateMyObject() {public void showName(){}};

        System.out.println(can.getClass());
        System.out.println(can2.getClass());
    }
}
