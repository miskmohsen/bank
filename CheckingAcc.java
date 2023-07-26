package bank;

public class CheckingAcc extends Account {
	
private static final int MaxLoan=50000;
private int avgOverdrafit;

public CheckingAcc(int accNum,int balance,int avgOverdrafit) {
	super(accNum,balance);
	this.avgOverdrafit=avgOverdrafit;
}
public int getAvgOverdrafit() {
	return avgOverdrafit;
}
public  int maxLoan() {
	if(getAvgOverdrafit()<=10000)
		return MaxLoan;
	else 
		return 0;
}

}
