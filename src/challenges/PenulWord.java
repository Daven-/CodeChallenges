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
public class PenulWord {
    public static void main (String[] args) throws IOException {
        File file = new File("src/longword.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] words;
        short length;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            words = line.split("\\s+");
            length = (short) words.length;
            if(words.length <= 1){
                System.out.println(words[0]);
            }else{
                System.out.println(words[length-2]);
            }
        }
    }
}
