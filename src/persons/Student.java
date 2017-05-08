package persons;
import java.util.*;

public class Student extends Person implements UniversityPerson {
	String kierunek;
	Vector<Double> oceny;
	
	void dostanOcene(double ocena, Teacher t){	//student jak ma dostaæ ocenê to mówi
		t.dodajOcene(ocena, this);	//teacherowi ¿eby j¹ wpisa³
	}

	public String getKierunek() {return kierunek;}
	public void setKierunek(String kierunek) {this.kierunek = kierunek;	}
	public Vector getOceny() {return oceny;	}
	public void setOceny(Vector oceny) {this.oceny = oceny;	}
}
