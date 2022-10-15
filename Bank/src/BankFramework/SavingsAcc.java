package BankFramework;

public class SavingsAcc extends BankAcc {
	
	private boolean isSalaried;
	static final private float MINBAL = 1000;
	
	
	public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried,float MINBAL) {
		super(accNo, accNm, accBal,MINBAL);
		this.isSalaried = isSalaried;
	}

	public void withdraw(){
		
	}

	@Override
	public String toString() {
		return "SavingsAcc [isSalaried=" + isSalaried + "]";
	}

}
