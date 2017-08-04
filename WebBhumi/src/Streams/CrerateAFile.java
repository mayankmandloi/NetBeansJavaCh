/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author web-bhumi
 */
public class CrerateAFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream fis = new FileOutputStream("1.txt");
        fis.write((byte)'m');
        fis.write((byte)'a');
        fis.write((byte)'y');
        fis.write((byte)'a');
        fis.write((byte)'n');
        fis.write((byte)'k');
        fis.write((byte)' ');
        fis.write((byte)'w');
        fis.write((byte)'e');
        fis.write((byte)'b');
        fis.write((byte)' ');
        fis.write((byte)'B');
        fis.write((byte)'h');
        fis.write((byte)'u');
        fis.write((byte)'m');
        fis.write((byte)'i');
        fis.close();


    }
}
