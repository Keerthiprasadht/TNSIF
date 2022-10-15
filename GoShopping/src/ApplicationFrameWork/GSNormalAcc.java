package ApplicationFrameWork;

import FrameWork.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accName,float charges,float deliverycharges) {
		super(accNo, accName, charges,deliverycharges);
		
	}
	
	public void bookProduct(float charges) {
		System.out.println("Normal user,your product charges are"+charges+"deliverycharges"+ deliverycharges);
	}

}
