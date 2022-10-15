package FrameWork;

public class ShopAcc {
	private int accNo;
	private String accName;
	private float charges;
	
	//Creating constructor
	public ShopAcc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}
	
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + "]";
	}
	

}
