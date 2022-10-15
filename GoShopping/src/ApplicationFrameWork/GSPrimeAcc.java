package ApplicationFrameWork;

import FrameWork.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges = 0;
	
	public GSPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		super(accno, accname, charges, isPrime);
		
	}

	
	public void bookProduct(float charges) {
		System.out.println("Dear prime user product charges"+charges);
	}


	

}
