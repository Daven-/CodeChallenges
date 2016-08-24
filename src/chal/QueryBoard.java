/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import static challenges.Ones.rec;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daven
 */
public class QueryBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("src/query.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        String[] data;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            data = line.split(" ");
            
            
            System.out.println();
        }
    }
    
}
