/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author web-bhumi
 */
public class Test extends TestPackage1.Test {
    public static void main(String[] args)  {
        File f = new File("hello.txt");
        try{
        if(f.exists())
        {
            
        }
        else
        {
            f.createNewFile();
        }
        PrintWriter fout = new PrintWriter(f);
        fout.println("I teach Java");
        fout.append("Hello text");
        
        }
        catch(IOException io)
        {
            System.out.println(io);
        }
    }
   
}
