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
 
        while (line != null) { // dop�ki nie koniec pliku
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        // po przeczytaniu ca�ego pliku:
        String allText = sb.toString();
      } 
   }
}
