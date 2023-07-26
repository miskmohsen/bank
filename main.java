package bank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public abstract class main {
public static void main(String[]args) throws CloneNotSupportedException  {
	
	Account[]a= { new CheckingAcc(8,-10000,20000),
			      new mortgageAcc(3,-90000,100000,1000000),
			      new ManagerAcc(17,30000,10),
			      new CheckingAcc(1,30,0)};
	
	      showLoan(a);
	      Arrays.sort(a);
	      System.out.println("after:");
	      showLoan(a);
	      AccountDuplication(a[0]);
	      
	
	}
//Q1
private static void showLoan(Account[] a) {
for(Account acc:a)
	System.out.println(acc.getAccNum()+":"+ acc.maxLoan());
	
}
//Q3
	public static void AccountDuplication(Account acc) throws CloneNotSupportedException {
		Account x=acc.clone();
		System.out.println("Account duplication:");
		System.out.println(x.getAccNum());
	}
	
	/*
	 * public static int sort(Account o,Account c) {
	 *  if(o.maxLoan()>c.maxLoan()) return -1;
	 *   else if(o.maxLoan()<c.maxLoan()) return 1; 
	 *   else return 0; }
	 */
		 	 
	}
		

