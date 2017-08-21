/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.*;

/**
 *
 * @author web-bhumi
 */
public class FileExample1 {

    public static void main(String[] args) throws Exception {
        File f = new File("aditi/adarsh/mayank");
        // f.createNewFile();
        //f.delete();
        //f.mkdir();
        //f.delete();
        //f.mkdirs();
        File f1 = new File("aditi");
        if (f1.isDirectory()) {
            String[] files = f1.list();
            for (String fs : files) {
                //System.out.println(f1.getPath()+"/"+fs);
                FileExample1 fe = new FileExample1();
                File dd = new File(f1.getPath()+ "/" +fs);
                System.out.println(fe.deleteFile(dd));

            }
        }

    }

    boolean deleteFile(File f) {
        System.out.println(f.getPath());
        if (f.isDirectory()) {
            if (f.list().length == 0) {
                System.out.println(f.getPath());
                return f.delete();
            } else {
                String files[] = f.list();
                for (String a : files) {
                    
                    deleteFile(new File(f.getPath() + "/" + a));
                }
                return deleteFile(f);
            }
        } else {
            System.out.println(f.getPath());
            return f.delete();
        }

    }

}
