package java_Obiektowa_8;

public class Person {
	//pola normalne
	int wiek;
	String imie;
	String nazwisko;
	//pola dla lekarza
	int hp;
	int iloscChorob;
	int zatrucie;	//zatrucie wyrazone w %
	
	
	
	//metody
	void dodajRok(){wiek++;	}//gdy osoba ma urodziny zwiêkszamy wiek o 1
	void zatruj(){zatrucie+=20;	}
	void dodajChorobe(){iloscChorob++; };
	
	//klasa wewnêtrzna
	class HealthSonda {
		public int getHp() {return hp; }
		public int getIloscChorob() {return iloscChorob; }
		public int getZatrucie() {return zatrucie; }
		
	}
	
	void pokazStanZdrowia(){
		HealthSonda stan=new HealthSonda();
	}
	

	//konstruktor
	Person(){
		wiek=0; imie="";nazwisko=""; hp=100; iloscChorob=0; zatrucie=0;
	}
	
	
	//setery i getery do nielekarzowych pól
	public int getWiek() {return wiek;}
	public void setWiek(int wiek) {	this.wiek = wiek;}
	public String getImie() {return imie;}
	public void setImie(String imie) {this.imie = imie;	}
	public String getNazwisko() {return nazwisko;}
	public void setNazwisko(String nazwisko) {	this.nazwisko = nazwisko;}
}
