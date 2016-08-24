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

/**
 *
 * @author Daven
 */
public class CapitalizeWords {
     public static void main (String[] args) throws IOException {
        File file = new File("src/cap.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        String[] data;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            data = line.split(" ");

            // Process line of input Here
            for (int i = 0; i < data.length; i++) {
                String temp = data[i];

                System.out.print(Character.toUpperCase(data[i].charAt(0))+ temp.substring(1, temp.length()) + " ");
            }
            System.out.println();
        }
    }
}
