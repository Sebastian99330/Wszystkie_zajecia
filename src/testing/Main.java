package testing;

public class Main {
	public static void main(String[] args) {
		ReadFile f=new ReadFile();
		f.openFile();
		//f.createFile();
		//f.addRecord();
		f.readFile();
		f.closeFile();
	}
}
