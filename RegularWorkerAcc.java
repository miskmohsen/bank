package bank;

public abstract class RegularWorkerAcc extends EmployeeAcc {
private boolean loanApproval;

public RegularWorkerAcc(int accNum,int balance,boolean loanApproval ) {
super( accNum, balance);
this.loanApproval=loanApproval;
}
public abstract int maxLoan();

}