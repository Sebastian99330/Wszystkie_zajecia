package persons;
import java.util.*;

public class Student extends Person implements UniversityPerson {
	String kierunek;
	Vector<Double> oceny;
	
	void dostanOcene(double ocena, Teacher t){	//student jak ma dosta� ocen� to m�wi
		t.dodajOcene(ocena, this);	//teacherowi �eby j� wpisa�
	}

	public String getKierunek() {return kierunek;}
	public void setKierunek(String kierunek) {this.kierunek = kierunek;	}
	public Vector getOceny() {return oceny;	}
	public void setOceny(Vector oceny) {this.oceny = oceny;	}
}
