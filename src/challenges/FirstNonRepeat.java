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
public class FirstNonRepeat {
     public static void main (String[] args) throws IOException {
        File file = new File("src/firstnonrepeat.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] buff;
        char key;
        HashMap<Character, Integer> map; // hash map to compress number sequences - doesn't work fully since location is not perserved. 
        Integer data;
        Integer set;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            buff = line.split("");
            key = 'I';//search for letter
            map = new HashMap();
            data = 0;
            set = 0;
            
            for (int i = 0; i < line.length(); i++) {
                key = line.charAt(i);
                if(!map.containsKey(key)){
                    data = 0;
                map.put(key, data);
                }else{
                    data = map.get(key);
                    data += 1;
                    map.put(key, data);
                }
            }
            // simple solution, bit more complicated solution
            // could use a hashmap to count the letters, then only check the letters
            // that appear only one time instead of having to chack all of them
            for (int i = 0; i < line.length(); i++) {
                set = map.get(line.charAt(i));
                if(set == 0){
                    System.out.println(line.charAt(i));
                    break;
                }
            }
        }
    }
}

                    
            
            