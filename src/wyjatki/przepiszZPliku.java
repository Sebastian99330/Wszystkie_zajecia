package wyjatki;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class przepiszZPliku  {

	public static void main(String[] args) throws IOException {
		//p.s. ocb z nawiasami po try?
		try (BufferedReader inputStream = new BufferedReader(new FileReader("plikOdczytu.txt"));
				PrintWriter outputStream = new PrintWriter(new FileWriter("plikZapisu.txt")) ){
			
			List<String> listaStringow=new LinkedList<String>();
			
		     String line;
		     while ((line = inputStream.readLine()) != null) {
		    	 listaStringow.add(line);		         
		     } //while
		     Collections.sort(listaStringow);
		     for(String linia : listaStringow){
		    	 outputStream.println(linia);
		     }
		    
		} //try
	} //main
} //klasê