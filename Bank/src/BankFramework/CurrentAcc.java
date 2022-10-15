package BankFramework;

public class CurrentAcc extends BankAcc {
	protected final float creditLimit = 50000;
	
	public CurrentAcc(int accNo, String accNm, float accBal,float MINBAL) {
		super(accNo, accNm, accBal,MINBAL);
		
	}

	public void withdraw() {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
