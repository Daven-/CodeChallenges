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
public class HexToDecimal {
    public static void main(String[] args)throws IOException{
        File file = new File("src/hex.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        int decimal;
        int count;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            decimal = 0;
            count = 0;
            for (int i = line.length()-1; i >= 0; i--) {
                decimal += Math.pow(16, count) * Character.getNumericValue(line.charAt(i));
                count++;
            }
            System.out.println(decimal);
        }
    }
}
