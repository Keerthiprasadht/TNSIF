package client;

import ApplicationFrameWork.GSNormalAcc;
import ApplicationFrameWork.GSPrimeAcc;
import ApplicationFrameWork.GSShopeFactory;

public class GoShopmain {

	public static void main(String[] args) {
		
		//step a
		GSShopeFactory gssfactory = new GSShopeFactory();
		gssfactory.getNewPrimeAccount(101, "keerthi", 567, true);
		gssfactory.getNewNormalAccount(102, "chandan", 686, 50);
		
		//step b
		GSPrimeAcc gsprime = new GSPrimeAcc(101,"keerthi",567,true);
		gsprime.bookproduct();
		
		//step c
		GSNormalAcc gsnormal = new GSNormalAcc(102, "chandan", 686, 50);
		gsnormal.bookProduct(686);
		
		
		//step e
		gsprime.toString();
		gsnormal.toString();
	}

}
