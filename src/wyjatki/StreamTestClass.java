package wyjatki;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class StreamTestClass {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj imie: ");
       // String imie = br.readLine();
        String imie="Arnold";
        System.out.println("Podaj wiek: ");
       // int wiek = Integer.parseInt(br.readLine());
        int wiek=30;
        System.out.println("\nPodano dane: " + imie + ", lat: " + wiek);
        
        System.out.println("Now we'll take care of quest no. 21");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.newLine();
        bw.write(imie);        
        bw.close();
        /*
        //WORKS WELL!!
        FileWriter writer = new FileWriter("demo.txt");
        writer.write("hello");
        writer.close();
        //another one?
        File file = new File("demo2.txt");
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file));
        os.write("hello");
        os.close();
        */
        
    }
}