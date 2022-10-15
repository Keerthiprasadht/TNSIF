package BankFramework;

public interface BankFactory {
	public abstract SavingsAcc getNewSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried, float mINBAL);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal);
	CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float MINBAL);
}
