/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import static challenges.BitPositions.rabbit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Daven
 */
public class DecimalToBinary {
    public static void main(String[] args) throws IOException{
        File file = new File("src/bits.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        
        String bitRep;
        String bitA;
        
        int bit;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            bitRep = "";
            bit = Integer.parseInt(line);
            bitA = "";
            
            if(bit != 0){
                bitRep = rabbit(bit, "");
                bitRep = new StringBuilder(bitRep).reverse().toString();
                System.out.println(bitRep);
            }else{
                System.out.println("0");
            }
            
       
        }
    }
    public static String rabbit(int num, String word){ 
        
         if(num <= 0){// convert to binary 
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
