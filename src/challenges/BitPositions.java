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
public class BitPositions {

     public static void main(String[] args) throws IOException{
        File file = new File("src/bit.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        String[] data;
        int word;
        String bit;
        char c1;
        char c2;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            data = line.split(",");
            bit = "";
            word = Integer.parseInt(data[0]);
            
            int x = Integer.parseInt(data[1]);
            int y = Integer.parseInt(data[2]);
           
            bit = rabbit(word, "");
            if(x != 0)
              x = x-1;
            if(y != 0)
              y = y-1;
            
            c1 = bit.charAt(x);
            c2 = bit.charAt(y);
            
            //System.out.println(c1+":"+c2);
            //System.out.println(bit);
            
           if(c1 == c2)
               System.out.println("true");
           else
               System.out.println("false");
        }
    }
     public static String rabbit(int num, String word){ 
         
         if(num <= 0){// make binary representtion 
             return word;
         }else{
             if(num%2 == 0){
                 word += "0";
             }else{
                 word += "1";
             }
             return rabbit(num - ((num/2)+num%2), word);
         }
     }
}
