package java_Obiektowa_8;

public class Main {
	public static void main(String[] args) {
		System.out.println("Elo");
		Person person = new Person();
		System.out.println();
		
		Person.HealthSonda hs = person.new HealthSonda();
		System.out.println("Oto stan zdrowia pacjenta: ");
		System.out.println("Pacjent ma: "+hs.getHp()+" hp,");
		System.out.println("choruje na: "+hs.getIloscChorob()+" chorob, ");
		System.out.println("i jego stan zatrucia w % wynosi obecnie: "+hs.getZatrucie()+"%");
	}
}
