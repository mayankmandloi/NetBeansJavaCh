package Streams;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.ByteArrayInputStream;

/**
 *
 * @author web-bhumi
 */
public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte arg0[] =new byte[1];
        ByteArrayInputStream bais = new ByteArrayInputStream(arg0);
        System.out.println(bais.read());
        System.out.println(bais.read());
    }
    
}
