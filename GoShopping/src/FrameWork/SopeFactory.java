package FrameWork;

public interface SopeFactory {
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accName,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo,String accName,float charges,float deliverycharges);

}
