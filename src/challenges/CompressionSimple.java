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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daven
 */
public class CompressionSimple {
    // hashmap implimentation 
    public static void main (String[] args) throws IOException {
        File file = new File("src/compress.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] buff;
        int[] num;
        int count;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            buff = line.split(" ");
            num = new int[buff.length];
            count = 1;
            
            // two loops! smh 
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(buff[i]);
                if(i != 0){
                    if(num[i] == num[i-1]){
                        count++;
                    }else{
                        System.out.print(" "+count+" "+num[i-1]);
                        count=1;
                    }
                }
            }
            System.out.print(" "+count+" "+num[num.length-1]);
            System.out.println();
        }
        
    }
}
