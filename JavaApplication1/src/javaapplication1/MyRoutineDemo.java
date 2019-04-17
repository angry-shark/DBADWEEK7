/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Administrator
 */
public class MyRoutineDemo {
    public static byte[] ByteArrayFromFile(String filepath) {
        try{ 
            java.io.File file=new java.io.File(filepath);
            java.io.FileInputStream fis = new java.io.FileInputStream(file);
            int fileLength = (int) file.length();
            byte[] incoming_file_data = new byte[fileLength]; // allocate byte array of right size
            fis.read(incoming_file_data, 0, fileLength ); // read into byte array
            fis.close();
            return incoming_file_data;
        }catch(Exception err){
            err.printStackTrace();return null;
        }
    }
}
