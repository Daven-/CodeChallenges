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
public class Compression {
    // hashmap implimentation 
    public static void main (String[] args) throws IOException {
        File file = new File("src/compress.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] buff;
        int[] compress;
        int key;
        int search;
        HashMap<Integer, Integer> map; // hash map to compress number sequences - doesn't work fully since location is not perserved. 
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            buff = line.split(" ");
            key = 0;
            map = new HashMap();
            compress = new int[buff.length];
            for (int i = 0; i < compress.length; i++) {
                key = Integer.parseInt(buff[i]);
                if(!map.containsKey(key)){
                map.put(key, 1);
                }else{
                    map.put(key, map.get(key)+1);
                }
            }
            search = Integer.parseInt(buff[0]);
            for (int i = 1; i < buff.length; i++) {
                if(search != Integer.parseInt(buff[i])){
                    System.out.print(map.get(search) + " " + search + " ");
                    search = Integer.parseInt(buff[i]);
                }
            }
                
            System.out.println();
        }
    }
    
}
