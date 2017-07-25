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
class GetDataFromDB
{
    void getData()
    {
        
        for(int i=0;i<10;i++)
        {
        System.out.println("I am bringing data......"+i);
        }
    }
}




public class CanIRun extends GetDataFromDB implements Runnable{

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
