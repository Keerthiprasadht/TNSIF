package BankApplicationFramework;

import BankFramework.SavingsAcc;

public class MMSavingAcc extends SavingsAcc{
	static final private float MINBAL =1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAL) {
		super(accNo, accNm, accBal, isSalaried,MINBAL);
		
	}
	
	public void withdraw(int i) {
		System.out.println("the minimum balance in savings bank is : "+MINBAL);
	}


}
