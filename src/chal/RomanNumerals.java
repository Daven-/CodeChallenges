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
public class RomanNumerals {

    public static void main(String[] args) throws IOException {
        File file = new File("src/romans.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        String[] sNum;
        int[] num;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            sNum = line.split("\\s+");
            num = new int[sNum.length];
            for (int i = 0; i < sNum.length; i++) {
                num[i] = Integer.parseInt(sNum[i]);
                for (int j = 0; j < 13; j++) {
                    switch (j) {
                        case 0:
                            num[i] = sub(1000, num[i]);
                            break;
                        case 1:
                            num[i] = sub(900, num[i]);
                            break;
                        case 2:
                            num[i] = sub(500, num[i]);
                            break;
                        case 3:
                            num[i] = sub(400, num[i]);
                            break;
                        case 4:
                            num[i] = sub(100, num[i]);
                            break;
                        case 5:
                            num[i] = sub(90, num[i]);
                            break;
                        case 6:
                            num[i] = sub(50, num[i]);
                            break;
                        case 7:
                            num[i] = sub(40, num[i]);
                            break;
                        case 8:
                            num[i] = sub(10, num[i]);
                            break;
                        case 9:
                            num[i] = sub(9, num[i]);
                            break;
                        case 10:
                            num[i] = sub(5, num[i]);
                            break;
                        case 11:
                            num[i] = sub(4, num[i]);
                            break;
                        case 12:
                            num[i] = sub(1, num[i]);
                            break;

                    }
                }
            }
            System.out.println();
        }
    }

    public static int sub(int key, int num) {

        if (num >= key && num > 0) {

            print(key);
            num = num - key;
            return sub(key, num);
        } else {
            return num;
        }

    }

    public static void print(int key) {
        switch (key) {
            case 1:
                System.out.print("I");
                break;
            case 5:
                System.out.print("V");
                break;
            case 10:
                System.out.print("X");
                break;
            case 50:
                System.out.print("L");
                break;
            case 100:
                System.out.print("C");
                break;
            case 500:
                System.out.print("D");
                break;
            case 1000:
                System.out.print("M");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 9:
                System.out.print("IX");
                break;
            case 40:
                System.out.print("XL");
                break;
            case 90:
                System.out.print("XC");
                break;
            case 400:
                System.out.print("CD");
                break;
            case 900:
                System.out.print("CM");
                break;
        }
    }
}
