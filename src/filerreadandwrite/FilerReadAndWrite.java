/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filerreadandwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Pavilion G4
 */
public class FilerReadAndWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  try {
            byte array [] = {'1','a','2','b','5'};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x < array.length ; x++) {
                os.write( array[x] ); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0; i< size; i++) {
                System.out.print((char)is.read() + " ");
            }
            is.close();
        } catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}