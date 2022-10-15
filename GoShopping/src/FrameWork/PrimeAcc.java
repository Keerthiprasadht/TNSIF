package FrameWork;

public class PrimeAcc extends ShopAcc {
	
	
	protected static boolean isPrime;
	public float charges;
	
	//constructor
	public PrimeAcc(int accno, String accname, float charges,boolean isPrime) {
		super(accno, accname, charges);
		
	}
	
	//methods
	public void bookproduct() {
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", charges=" + charges + "]";
	}
	
	}


