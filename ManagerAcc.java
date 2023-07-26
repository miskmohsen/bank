package bank;

public class ManagerAcc extends EmployeeAcc {
	private static final int maxLoan=100000;
private int years;
public ManagerAcc(int accNum,int balance,int years) {
	super( accNum, balance);
	this.years=years;
}
public int maxLoan() {
return maxLoan;
}
}
