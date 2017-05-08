package persons;

public class Teacher extends Person implements UniversityPerson, VipPerson {
	int pensja;	//pensja wyra�ona w z�
	String przedmiot;
	
	public void dodajOcene(double ocena, Student s){
		System.out.println("dostales "+ocena+"!");	//ta linijka odr�nia t� implementacje metody od domy�lnej w interfejsie
		s.oceny.addElement(new Double(ocena));

	}
	
	//default constructor
	public Teacher() {
		pensja=2000;
	}
	
	//setery i getery
	public int getPensja() {return pensja; }
	public void setPensja(int pensja) {	this.pensja = pensja;}
	public String getPrzedmiot() {	return przedmiot;	}
	public void setPrzedmiot(String przedmiot) {this.przedmiot = przedmiot;	}


}
