/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSynchronization;

/**
 *
 * @author web-bhumi
 */
public class SyncBlocks {
    String s1;
    int a;
    void showName()
    {
        synchronized(s1)
        {
            System.out.println("Hello");
        }
        
        synchronized(s1)
        {
            a++;
        }
    }
    
}
