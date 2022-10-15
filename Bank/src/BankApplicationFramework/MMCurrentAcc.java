package BankApplicationFramework;

import BankFramework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal,float MINBAL) {
		super(accNo, accNm, accBal,MINBAL);
		
	}
	public void  withdraw(float MINBAL) {
		System.out.println("Credit limit should be : " + creditLimit +"minimum balence in current account is" + MINBAL);
		
	}

}
