package wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) {
    	System.out.println("Zaraz zabijê eklipsa");
    	 try{
    	File file;
        FileInputStream fis = null;
    	try{
            file = new File("C:/newFile.txt");
    	}
    	catch(Exception e){
            e.printStackTrace();
    		return ;
    	}
        fis = new FileInputStream(file); // FileInputStream - klasa zamieniaj¹ca plik na strumieñ
        System.out.println("Ca³kowity rozmiar pliku (w bajtach) : " + fis.available());
        int content;
        while ((content = fis.read()) != -1) {
            System.out.print((char) content); // konwertujemy na char
        }
     
    	   fis.close(); // zamykamy strumieñ jeœli zosta³ otwarty
       }
       catch(Exception e){}
    }
}