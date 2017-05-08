package wyjatki;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
 
	public static void main(String args[]) {
	    try {
	      new ExceptionExample().readFile();
	      System.out.println("TO JEST TEXT");
	    } catch (FileNotFoundException e) {
	        System.out.println("Brak pliku. Powód: " + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("Problem ogólny WE/WY. Powód: " + e.getMessage());
	    }
	    //... dalsza czêœæ kodu
	    
	    String text = null;
	    // ...
	    try{
	    	text.substring(1,4); // throw: NullPointerException
	    }
	    catch(NullPointerException e){
	    	System.out.println("z³apaliœmy NullPointerException!");
	    }
	}
 
   public void readFile() throws IOException{
       FileReader fr = new FileReader("E://file.txt");
       char [] a = new char[50];
       fr.read(a);   // wczytaj 50 znaków
       for(char c : a){
         System.out.print(c);   // drukuje znak po znaku
       }
   }
}
