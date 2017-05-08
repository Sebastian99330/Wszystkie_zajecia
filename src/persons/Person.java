package persons;

import java.util.List;

abstract class Person {
	int wiek;
	String imie;
	String nazwisko;
	static int liczbaLudziWSystemie=0;	//ile ludzi do tej pory stworzyliœmy w systemie na naszej uczelni?
	
	Person(){
		liczbaLudziWSystemie++;	//jak tworzymy cz³owieka to dajemy znaæ systemowi ¿e liczba ludzi wzros³a o 1
	}
	
	public void printList(List<? extends Number> numbers) {  // u¿ycie ? z extends
	    for(Number number: numbers){
	        System.out.println(number);
	    }
	}
	/*
	// przyk³ad 5:
	 <T> void addPersonToList2(List<T extends Person> list) {
		//list.add(new Person());// b³¹d bo nie wiadomo czy to lista VipPerson, Person, 
				       // czy jakaœ inna klasa dziedzicz¹ca po Person :)
				       // gdyby to by³a List<SuperPerson> to nie mogê przecie¿ dodaæ Person
				       // bo Person nie jest SuperPerson. To SuperPerson jest Person.
		//list.add(new VipPerson()); 	// te¿ b³¹d
	}
	*/

	//setery i getery
	public int getWiek() {return wiek;}
	public void setWiek(int wiek) {	this.wiek = wiek;}
	public String getImie() {return imie;}
	public void setImie(String imie) {this.imie = imie;	}
	public String getNazwisko() {return nazwisko;}
	public void setNazwisko(String nazwisko) {	this.nazwisko = nazwisko;}
	public static int getLiczbaLudziWSystemie() {return liczbaLudziWSystemie;}
		
}
