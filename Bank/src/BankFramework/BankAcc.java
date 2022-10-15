package BankFramework;

public class BankAcc {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	//constructors
	public BankAcc(int accNo, String accNm, float accBal,float MINBAL) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw() {
		
	}
	public void deposite() {
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	

}
