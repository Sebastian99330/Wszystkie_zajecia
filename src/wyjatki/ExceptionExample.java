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
	        System.out.println("Brak pliku. Pow�d: " + e.getMessage());
	    } catch (IOException e) {
	        System.out.println("Problem og�lny WE/WY. Pow�d: " + e.getMessage());
	    }
	    //... dalsza cz�� kodu
	    
	    String text = null;
	    // ...
	    try{
	    	text.substring(1,4); // throw: NullPointerException
	    }
	    catch(NullPointerException e){
	    	System.out.println("z�apali�my NullPointerException!");
	    }
	}
 
   public void readFile() throws IOException{
       FileReader fr = new FileReader("E://file.txt");
       char [] a = new char[50];
       fr.read(a);   // wczytaj 50 znak�w
       for(char c : a){
         System.out.print(c);   // drukuje znak po znaku
       }
   }
}
