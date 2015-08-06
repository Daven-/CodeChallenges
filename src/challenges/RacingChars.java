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
public class RacingChars {
    static String sM;
    public static void main(String args[]) throws IOException {
        File file = new File("src/racingchars.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        boolean keyFound;
        int lastPos = -1;
        int redPos = -1;
        int lastKnown;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            keyFound = false;
            lastKnown = -1;
            sM = "";
            char a;
            for (int i = 0; i < line.length(); i++) {
                a = line.charAt(i);
                if(a == 'C'){
                    if(lastPos != -1){
                        if(lastKnown != -1){
                            sM = sM.substring(0, lastKnown) + "_" + sM.substring(lastKnown+1);
                            printLine(i, redPos);
                        }else{
                        printLine(i, lastPos);
                        }
                        
                        lastPos = i;
                        keyFound = true;
                        
                    }else{
                        sM += "|";
                        lastPos = i;
                        keyFound = true;
                    }
                }else if(a == '_' && !keyFound){
                    if(lastPos != -1){
                    printLine(i, lastPos);
                    redPos = lastPos;
                    lastPos = i;
                    lastKnown = i;
                    keyFound = true;
                    }else{
                        sM += "|";
                        lastPos = i;
                        keyFound = true;
                    }
                }else{
                    if(a != '_'){
                    sM += "#";
                    }else{
                        sM += "_";
                    }
                }
                    
            }
            System.out.println(sM);
        }


    }
    
    public static void printLine(int i, int lastPos){
       // System.out.println("i: "+i+ "  last: "+lastPos);
        if(i > lastPos){
            sM += "\\";
        }else if(i < lastPos){
            sM += "/";
        }else{
            sM += "|";
        }
    }

}
