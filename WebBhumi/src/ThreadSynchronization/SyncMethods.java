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


class SynchronizedCounter {
    private int c = 0;
    String s="t";

    public synchronized void increment(int i) {
    //public void increment(int i) {
        c+=i;
        try{
        Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }
        System.out.println(c);
    }
}


class SyncMethods extends Thread
{
    SynchronizedCounter obj1;
    String count;
    int val;
    public SyncMethods(SynchronizedCounter sc,int val) {
        this.obj1=sc;
        this.val=val;
    }
    public void run()
    {

        for (int i = 0; i < 10; i++) {
         obj1.increment(val);
            
    }
    }
public static void main(String[] args) {
        SynchronizedCounter sc = new SynchronizedCounter();
        SyncMethods t1 = new SyncMethods(sc,100);
        SyncMethods t2 = new SyncMethods(sc,5);

        t1.start();
        t2.start();
        
    }    
    

    
}
