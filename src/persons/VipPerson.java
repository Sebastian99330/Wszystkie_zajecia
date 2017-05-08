package persons;

interface VipPerson {
	boolean dostepDoOcen=true;
	default void dodajOcene(double ocena, Student s){	//vip czyli uprzywilejowany pracownik czyli teacher lub dyrektor
		s.oceny.add(ocena);
	}
}
