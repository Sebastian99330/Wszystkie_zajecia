package persons;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Person.liczbaLudziWSystemie);
		Teacher t=new Teacher();
		Student s=new Student();
		System.out.println(t.getPensja());
		try{
			t.dodajOcene(5.0, s); // rzuca wyj¹tek
		}
		catch(Exception E){
			System.out.println("Rzucono wyj¹tek przy wstawianiu oceny, nie mam pojecia czemu");
		}
	}
	

}
