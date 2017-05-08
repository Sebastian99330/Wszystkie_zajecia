package kolekcje;


public class Person implements Comparable<Person> {
	Integer wiek;
	String imie;
	String nazwisko;
	Integer pesel;
	
	public Person(String imie, String nazwisko, Integer wiek){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.wiek=wiek;
	}
	
	
	
	 @Override
	public String toString() {
		return "Person [wiek=" + wiek + ", imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + "]";
	}

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
	public Integer getWiek() {return wiek;}
	public void setWiek(int wiek) {	this.wiek = wiek;}
	public String getImie() {return imie;}
	public void setImie(String imie) {this.imie = imie;	}
	public String getNazwisko() {return nazwisko;}
	public void setNazwisko(String nazwisko) {	this.nazwisko = nazwisko;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
		result = prime * result + ((wiek == null) ? 0 : wiek.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		if (wiek == null) {
			if (other.wiek != null)
				return false;
		} else if (!wiek.equals(other.wiek))
			return false;
		return true;
	}



	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
	       return this.wiek.compareTo(o.wiek);
	}
	
}