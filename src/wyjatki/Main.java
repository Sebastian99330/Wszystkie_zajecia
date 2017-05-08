package wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) {
    	System.out.println("Zaraz zabij� eklipsa");
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
        fis = new FileInputStream(file); // FileInputStream - klasa zamieniaj�ca plik na strumie�
        System.out.println("Ca�kowity rozmiar pliku (w bajtach) : " + fis.available());
        int content;
        while ((content = fis.read()) != -1) {
            System.out.print((char) content); // konwertujemy na char
        }
     
    	   fis.close(); // zamykamy strumie� je�li zosta� otwarty
       }
       catch(Exception e){}
    }
}