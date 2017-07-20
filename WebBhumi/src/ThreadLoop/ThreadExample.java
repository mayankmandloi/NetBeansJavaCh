/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadLoop;

/**
 *
 * @author web-bhumi
 */
public class ThreadExample extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++){
            System.out.println("I am from thread "+this+" "+i);
            try {
                this.sleep(2000);
            } catch (Exception e) {
            }
            
        }
            
    }
    public static void main(String[] args) {
        ThreadExample th1 = new ThreadExample();
        ThreadExample th2 = new ThreadExample();
        th1.start();
        th2.start();
        for(int i=0;i<10;i++){
            System.out.println("I am from thread main"+i);
            }
        
    }
    
    
    
    
}
