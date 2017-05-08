package generyki;

import java.util.*;

import kolekcje.Person;

public class Main {	//zadanie 12
	/*
	public static void main(String[] args) {
	Set<Person> zbior1=new HashSet<>();
		
		//dodawanie obiektów do mapy
		Person person1=new Person(30, "Janusz", "Darkowski", 1000);
		zbior1.add(person1);
		Person person2=new Person(26, "Pablo", "Novacci", 2000);
		zbior1.add(person2);
		Person person3=new Person(30, "Janusz", "Darkowski", 1000);
		zbior1.add(person3);
		Person person4=new Person(32, "Miros³aw", "Zelent", 4000);
		zbior1.add(person4);
		
		System.out.println("Set 1: ");
		//proœciej:
		for(Person person: zbior1){
		    System.out.println(person);
		}
		
		//przed dodaniem hash i equals mo¿na by³o mieæ 2 identyczne elementy, po nie.
		

		Set<Person> newSet1 = new TreeSet<>(new Comparator<Person>(){
			// implementacja compare(String a, String b){.... }
			    @Override
			    public int compare(Person a, Person b){
			       return a.getWiek().compareTo(b.getWiek());
			    };
		});
		
		newSet1.add(person1);
		newSet1.add(person2);
		newSet1.add(person3);
		newSet1.add(person4);
		System.out.println("\nZbior tree 1 uporzadkowany po wieku: ");
		for(Person zmiennik: newSet1){
			System.out.println(zmiennik);
		}
		
		
		
		////NIESTETY COŒ NEI TAK Z TYM SORTOWANIEM MALEJ¥CYM ALE NA ZAJÊCIACH SIÊ O TO ZAPYTAM
		Set<Person> newSet2 = new TreeSet<>(new Comparator<Person>(){
		    @Override
		    public int compare(Person a, Person b){
		    	 if(a.getWiek() == b.getWiek()){
		             return 0;
		         } else if(a.getWiek() < b.getWiek()) {
		             return 1;
		         } else {
		             return -1;
		         }
		    };
	
}
	*/
}