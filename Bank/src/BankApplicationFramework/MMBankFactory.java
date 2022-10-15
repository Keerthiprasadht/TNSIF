package BankApplicationFramework;

import BankFramework.BankFactory;
import BankFramework.CurrentAcc;
import BankFramework.SavingsAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingsAcc getNewSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAL) {
		MMSavingAcc mmsavings = new MMSavingAcc(accNo,accNm,accBal,isSalaried,MINBAL);
		return mmsavings;           
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float MINBAL) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo,accNm,accBal,MINBAL);
		return mmcurrent;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
