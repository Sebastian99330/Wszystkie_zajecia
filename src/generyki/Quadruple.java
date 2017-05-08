package generyki;

public class Quadruple<L,M,R,RR> extends Triple<L,M,R> {
	 private RR rightRight;

	protected Quadruple(L left, M middle, R right, RR rightRight) {
		super(left, middle, right);
		// TODO Auto-generated constructor stub
		this.rightRight=rightRight;
	}

	 public RR getRightRight(){
	   return rightRight;
	 }
	 
	 public void setRightRight(RR rightRight){
	   this.rightRight = rightRight;
	 }
		 
}
