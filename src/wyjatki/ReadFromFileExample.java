package wyjatki;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ReadFromFileExample {
 
   public static void main(String args[]) throws FileNotFoundException, IOException {
      try ( BufferedReader br = new BufferedReader(new FileReader("filemoj.txt")) ){
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
 
        while (line != null) { // dopóki nie koniec pliku
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        // po przeczytaniu ca³ego pliku:
        String allText = sb.toString();
      } 
   }
}
