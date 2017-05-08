package kolekcje;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Collections.sort(TreeMap<Integer, String> tm, new Comparator<Integer>(){
		    @Override
		    public int compare(Integer a, Integer b){
		       return a.compareTo(b);
		    }
		});
		Map<Integer, String> tm = new TreeMap<>(new Comparator<Integer>()) ;
		
		// Osoby i ich d³ug
		tm.put(3434, "dropYou");
		tm.put(123, "pullUpOnYou");
		tm.put(1378, "popYou");
		tm.put(99, "choppa");
		 
		// zwróæ zbiór wszystkich par klucz-wartoœæ
		Set<Map.Entry<Integer, String>> set = tm.entrySet(); 
		 
		// iteratoror po zbiorze
		Iterator<Map.Entry<Integer, String>> i = set.iterator();
		 
		System.out.println("Teraz wyswietla elementy: ");
		// Display elements
		while(i.hasNext()) {
		    Map.Entry<Integer, String> pair = i.next();
		    System.out.println(pair.getKey() + ": " + pair.getValue());
		}
		System.out.println("\nTeraz posortujemy");
		//Collections.sort(treeMap);
		
		
		// Adrian po¿ycza kolejne 1000
		System.out.println("Adriana nowy d³ug: " + tm.get(99));
	}
}
