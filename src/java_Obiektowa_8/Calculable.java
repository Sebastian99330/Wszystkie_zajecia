package java_Obiektowa_8;

public interface Calculable {
	 //JAVA 7:
    double PI = 3.1415;
    // powy¿sze oznacza: public static final double PI = 3.1415;
    // inne modyfikatory s¹ niedozwolone
 
 
    // standardowa metoda bez cia³a. To co znamy:
    double add(double left, double right);
 
    //od teraz Java 8:
    default double multiply(double left, double right){
        return left * right;
    }

}
