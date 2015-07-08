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
public class SwapCase {
    public static void main (String[] args) throws IOException {
        File file = new File("src/swap.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] sData;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sData = line.split("");
            // Process line of input Here
            for (int i = 0; i < sData.length; i++) {
                if(sData[i].length() >= 1)
                if(Character.isUpperCase(sData[i].charAt(0))){
                     sData[i] = sData[i].toLowerCase();
                     System.out.print(sData[i]);
                }else{
                    sData[i] = sData[i].toUpperCase();
                    System.out.print(sData[i]);
                }
                
               
            }
            System.out.println();
        }
    }
}
