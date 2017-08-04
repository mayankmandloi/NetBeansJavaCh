/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;;

/**
 *
 * @author web-bhumi
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception {
        InputStream iis = new FileInputStream("1.txt");
        BufferedInputStream is = new BufferedInputStream(iis);
        System.out.println((char)is.read());        
        is.mark(0);
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        is.reset();
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());


        
        
        
    }
}
    