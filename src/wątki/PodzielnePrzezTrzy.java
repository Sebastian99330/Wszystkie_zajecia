package w¹tki;

public class PodzielnePrzezTrzy extends Thread {
	
	public void wypiszPodzielnePrzezTrzy(int a, int b){
		System.out.println("\nLiczby podzielne przez 3 od: "+a+" do "+b);
		for(int i=a;i<b;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
	
	public void run(int a, int b){
		this.wypiszPodzielnePrzezTrzy(a,b);
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			PodzielnePrzezTrzy ppt=new PodzielnePrzezTrzy();
			ppt.run(i*100,(i+1)*100);
		}
	}
}
