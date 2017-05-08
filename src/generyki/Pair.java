package generyki;
public class Pair<L,R> {
	 
	private L left;
	private R right;
 
	protected Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}
	public L getLeft() {
		return left;
	}
	public void setLeft(L left) {
		this.left = left;
	}
	public R getRight() {
		return right;
	}
	public void setRight(R right) {
		this.right = right;
	}
	
	public static <L,R> Pair<L,R> of(L left, R right){
		return new Pair<L,R>(left, right);
	}
 
	public static void main(String[] args) {
		System.out.println("Poczatek to");
		Pair<String, Integer> para = new Pair<>("AAA", 1); // - konstruktor zrobi³em protected. Poza klas¹ Pair nie mo¿na tego zrobiæ.
		Pair<String, Integer> pair2 = Pair.of("AAA", 1);		
		String text = pair2.getLeft();

		System.out.println("Koniec to");
	}
}
