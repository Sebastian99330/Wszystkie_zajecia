package persons;

import java.util.List;

abstract class Person {
	int wiek;
	String imie;
	String nazwisko;
	static int liczbaLudziWSystemie=0;	//ile ludzi do tej pory stworzyli�my w systemie na naszej uczelni?
	
	Person(){
		liczbaLudziWSystemie++;	//jak tworzymy cz�owieka to dajemy zna� systemowi �e liczba ludzi wzros�a o 1
	}
	
	public void printList(List<? extends Number> numbers) {  // u�ycie ? z extends
	    for(Number number: numbers){
	        System.out.println(number);
	    }
	}
	/*
	// przyk�ad 5:
	 <T> void addPersonToList2(List<T extends Person> list) {
		//list.add(new Person());// b��d bo nie wiadomo czy to lista VipPerson, Person, 
				       // czy jaka� inna klasa dziedzicz�ca po Person :)
				       // gdyby to by�a List<SuperPerson> to nie mog� przecie� doda� Person
				       // bo Person nie jest SuperPerson. To SuperPerson jest Person.
		//list.add(new VipPerson()); 	// te� b��d
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
