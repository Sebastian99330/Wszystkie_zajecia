package testing;

import java.io.*;
import java.util.*;


public class ReadFile {
	private Scanner read;
	
	public void openFile(){
		try{
			read = new Scanner (new File ("fred.txt"));
		}
		catch(Exception e){
			System.out.println("There was a problem with opening the file"); 
		}
	}
	
	public void readFile(){
		try{
			while(read.hasNext()){
				String line = read.next();
				System.out.println("Wczytano: "+line);
			}
		}
		catch(Exception e){
			System.out.println("LOL");
		}
		
	}
	
	public void closeFile(){
		read.close();
	}
}
