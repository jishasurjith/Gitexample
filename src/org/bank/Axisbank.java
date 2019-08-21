package org.bank;

public class Axisbank extends Bankinfo {
	public void deposit()
	{
		System.out.println("Deposit: 10,000");
	}
	public static void main(String[] args) {
		Axisbank a=new Axisbank();
		a.deposit();
		a.fixed();
	}
}
