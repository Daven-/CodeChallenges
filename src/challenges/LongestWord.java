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
public class LongestWord {
    public static void main (String[] args) throws IOException {
        File file = new File("src/longword.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        String[] words;
        int key;
        short length;
        while ((line = buffer.readLine()) != null) {
            key = 0;
            length = 0;
            line = line.trim();
            words = line.split("\\s+");

            for (int i = 0; i<words.length; i++) {
                if(words[i].length() > length){
                    length = (short) words[i].length();
                    key = i;
                }
            }
            System.out.println(words[key]);
        }
    }
}
