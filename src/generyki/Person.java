package generyki;

public class Person {
	int wiek;
	String imie;
	String nazwisko;
	Integer pesel;
	
	Person(){}
	
	Person(int wiek, String imie, String nazwisko, Integer pesel) {
		this.wiek = wiek;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
	}
	
	void przedstawSie(){
		System.out.println("Imie i nazwisko, wiek i pesel: "+imie+" "+nazwisko+" "+wiek+" "+pesel);
	}
	
	//setery i getery
	public int getWiek() {return wiek;}
	public void setWiek(int wiek) {	this.wiek = wiek;}
	public String getImie() {return imie;}
	public void setImie(String imie) {this.imie = imie;	}
	public String getNazwisko() {return nazwisko;}
	public void setNazwisko(String nazwisko) {	this.nazwisko = nazwisko;}
		
}
