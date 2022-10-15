package BankClient;

import BankApplicationFramework.MMBankFactory;
import BankApplicationFramework.MMCurrentAcc;
import BankApplicationFramework.MMSavingAcc;

public class Bankmain {

	public static void main(String[] args) {
		MMBankFactory mmfactory = new MMBankFactory();
		mmfactory.getNewSavingsAcc(9632, "Keerthi", 96000, true, 1000);
		mmfactory.getNewCurrentAcc(5367, "chandan", 196000);
		
		MMSavingAcc mmsavings = new MMSavingAcc(9632, "Keerthi", 96000, true, 1000);
		mmsavings.withdraw(10000);
		
		MMCurrentAcc mmcurrent = MMCurrentAcc(5367, "chandan", 196000);
		mmcurrent.withdraw(20000);
	}

	private static MMCurrentAcc MMCurrentAcc(int i, String string, int j) {
		
		return null;
	}


	}
	
	


