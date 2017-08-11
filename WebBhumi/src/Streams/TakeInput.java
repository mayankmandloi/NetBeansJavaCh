/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class TakeInput {
    public static void main(String[] args) throws Exception {
        Console c = System.console();
        String s = c.readLine();
        File f =  new File("1.txt");
        System.out.println(f.createNewFile());
        /*FileOutputStream fos = new FileOutputStream(f);
        byte a[]=new byte[100];
        a=s.getBytes();
        for(int i=0;i<a.length;i++)
        {
            fos.write(a[i]);
        }
        fos.close();
       */
        FileWriter fw = new FileWriter(f);
        fw.write(s);

//        fw.flush();
//        fw.close();
    }
}
