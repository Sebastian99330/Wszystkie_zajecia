package wyklady;

public class PierwszaKlasa implements SprawdzTo, Iface2  {
	public static void main(String[] args) {
		System.out.println("Siemka");

		PierwszaKlasa p=new PierwszaKlasa();
		p.sayHello();
		p.introduceYourself();
		p.rzucMiêsem();
	}

	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("I'm saying Hello!");
	}


	@Override
	public void introduceYourself() {
		// TODO Auto-generated method stub
		System.out.println("My name is Martin.");

	}

	@Override
	public void rzucMiêsem() {
		// TODO Auto-generated method stub
		System.out.println("(#*(!@$@");
	}

}
