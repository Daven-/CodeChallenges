import java.io.*;
import java.util.*;
public class Poker {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] lines = new String[2];
        String[] cards = new String[2];
        String[] card1 = new String[2];
        String[] card2 = new String[2];
        HashMap map = new HashMap();
        map.put("2", new Integer(2));
        map.put("3", new Integer(3));
        map.put("4", new Integer(4));
        map.put("5", new Integer(5));
        map.put("6", new Integer(6));
        map.put("7", new Integer(7));
        map.put("8", new Integer(8));
        map.put("9", new Integer(9));
        map.put("10", new Integer(10));
        map.put("J", new Integer(11));
        map.put("Q", new Integer(12));
        map.put("K", new Integer(13));
        map.put("A", new Integer(14));
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            lines = line.split(" \\| ");
            cards = lines[0].split(" ");
            card1 = cards[0].split("");
            card2 = cards[1].split("");
            if(card1.length == 3){
              card1[0] = "10";
              card1[1] = card1[2];
            }
            if(card2.length == 3){
              card2[0] = "10";
              card2[1] = card2[2];
            }
            if(card1[0].equals(card2[0])){
              if (card1[1].equals(card2[1])) {
                System.out.println(lines[0]);
              }else{
                // java Poker "poker.txt"
                // if their the same kind of card print both else print the one that matches the trump card

                if(card1[1].equals(lines[1])){
                  System.out.println(cards[0]);
                }else if(card2[1].equals(lines[1])){
                  System.out.println(cards[1]);
                }else{
                  System.out.println(lines[0]);
                }
              }
            }else{
              if(card1[0].equals("A") && card2[0].equals("2") || card1[0].equals("2") && card2[0].equals("A")){
                if(card1[1].equals(lines[1]) && card2[1].equals(lines[1])){
                  int x = (int) map.get(card1[0]);
                  int y = (int) map.get(card2[0]);
                  if(x > y){
                    System.out.println(cards[0]);
                  }else{
                    System.out.println(cards[1]);
                  }
                }else if(card2[1].equals(lines[1])){
                  System.out.println(cards[1]);
                }else if(card1[1].equals(lines[1])){
                  System.out.println(cards[0]);
                }else{
                  int x = (int) map.get(card1[0]);
                  int y = (int) map.get(card2[0]);
                  if(x > y){
                    System.out.println(cards[0]);
                  }else{
                    System.out.println(cards[1]);
                  }
                }
              }else{
                int x = (int) map.get(card1[0]);
                int y = (int) map.get(card2[0]);
                if(x > y){
                  System.out.println(cards[0]);
                }else{
                  System.out.println(cards[1]);
                }
              }
            }
        }
    }
}
