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
public class RightMostLetter {

  /**
     * @param args the command line arguments
     * get the rightmost appearence 
     */
    public static void main(String[] args) throws IOException {
        File file = new File("src/rightmost.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        String[] data;
        String word;
        char letter;
        boolean found;
        int num;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            data = line.split(",");
            word = data[0];
            letter = data[1].charAt(0);
            found = false;
            num = 0;
            for (int i = word.length()-1; i >= 0; i--) {
                if(letter == data[0].charAt(i)){
                    found = true;
                    num = i;
                    break;
                }else{
                    found = false;
                }
            }
            if(found){
                System.out.println(num);
            }else{
                System.out.println("-1");
            }
            
        }
    }
    
}
