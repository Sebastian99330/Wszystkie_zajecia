package wyjatki;

class MyException extends Exception{
	
}

class TestClass {
	
	public static double divide(Double a, Double b) throws MyException{
		if(b==0){
			throw new MyException();
		}
		return a/b;
	}
	

}
