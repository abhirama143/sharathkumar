package com.loans.studyloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici i=new Icici();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("hi iam withdrawl override method in icici3 class");
	}

}
