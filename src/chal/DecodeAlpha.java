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
public class DecodeAlpha {

    public static void main(String[] args) throws IOException {
        File file = new File("src/decode.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        String[] temp;
        int temp1 = 0;
        int temp2 = 0;
        int totalComb;
       
        while((line = buffer.readLine())!= null){
            line = line.trim();
            temp = line.split("");
            totalComb = 1;
            for (int i = 1; i < temp.length; i++) {
                if(i+2 <= temp.length){
                    //count number of combinations with the
                    // current and next one 
                    temp1 = Integer.valueOf(temp[i]);
                    temp2 = Integer.valueOf(temp[i+1]);
                    if(temp1 <= 2 && temp2 <= 6){
                        totalComb += 1;
                    }
                   // System.out.println(temp + " " + temp2);
                }else{
                    break;
                }
            }
            System.out.println(totalComb);
        }
    }

}
