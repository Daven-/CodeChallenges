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
public class MajorElement {
    // hashmap implimentation 
    public static void main (String[] args) throws IOException {
        File file = new File("src/major.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] buff;
        int key;
        HashMap<Integer, Integer> map; 
        int half = 0;
        boolean found;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            buff = line.split(",");
            half = buff.length/2;
            key = 0;
            found = false;
            map = new HashMap();
            for(int i = 0; i < buff.length; i++) {
                key = Integer.parseInt(buff[i]);
                if(!map.containsKey(key)){
                map.put(key, 1);
                }else{
                    map.put(key, map.get(key)+1);
                }
            }
            
            for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
                Integer key1 = entrySet.getKey();
                Integer value = entrySet.getValue();
                if(value > half){
                    System.out.println(key1);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("None");
            }
        }
    }
}
