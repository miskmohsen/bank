package bank;

public abstract class Account implements Cloneable,Comparable<Account> {
protected int accNum;
protected int balace;

public Account(int accNum,int balance) {
	this.accNum=accNum;
	this.balace=balance;
	
}
public int getAccNum() {
	return accNum;
}
public abstract int maxLoan();

	
	  public Account clone() throws CloneNotSupportedException{ 
		  return (Account)super.clone(); }
	  
	
	//Q2
	  public int compareTo(Account o) { 
		  int i= o.maxLoan()-maxLoan(); 
		  return i; 
		  }
	 
	 }