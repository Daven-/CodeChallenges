/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daven
 */
public class Mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("src/mod.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        String[] data;
        while((line = buffer.readLine())!= null){
            //line = line.trim();
            data = line.split(",");
            System.out.println(Integer.parseInt(data[0])%Integer.parseInt(data[1]));
        }
    }
    
}
