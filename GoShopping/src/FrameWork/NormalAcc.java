package FrameWork;

public class NormalAcc extends ShopAcc {
	protected float deliverycharges;
	
	public NormalAcc(int accNo, String accName, float charges, float deliverycharges) {
		super(accNo, accName, charges);
		this.setDeliverycharges(deliverycharges);
	}




	public void bookProduct(float charges) {
		
	}


	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + getDeliverycharges() + "]";
	}




	public float getDeliverycharges() {
		return deliverycharges;
	}




	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	
	
	


}
