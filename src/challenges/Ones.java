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
public class Ones {
      public static void main(String[] args)throws IOException{
        File file = new File("src/ones.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
       
        String[] count;
        while((line = buffer.readLine())!= null){
            line = line.trim();
            count = line.split(" ");
            for(String n : count) {
                rec(Integer.parseInt(n), 0);
            }
        }
    }
      public static void rec(int n, int count){
          if(n == 1){
              count++;
              System.out.println(count);
          }else if(n == 0){
              System.out.println(count);
          }else{
              if(n%2 == 1){
                  count++;
                  rec((n-1)/2,count);
              }else{
                  rec(n/2,count);
              }
          }
      }
}
