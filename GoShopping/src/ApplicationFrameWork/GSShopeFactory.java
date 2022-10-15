package ApplicationFrameWork;

import FrameWork.NormalAcc;
import FrameWork.PrimeAcc;
import FrameWork.SopeFactory;

public class GSShopeFactory implements SopeFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo,accName,charges,isPrime);
		
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accName, float charges, float deliverycharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(accNo,accName,charges,deliverycharges);
		return gsnormal;
	}
	
	
	
}
