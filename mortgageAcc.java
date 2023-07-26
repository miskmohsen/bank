package bank;

public class mortgageAcc extends CheckingAcc{
private int mortgageAmount;

public mortgageAcc(int accNum,int balance,int avgOverdrafit,int mortgageAmount) {
	super(accNum, balance, avgOverdrafit);
	this.mortgageAmount=mortgageAmount;
}
}
