package com.loans.studyloans;

public class Hdfc implements Rbi{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc h=new Hdfc();
		h.withdrawl();
	}

	@Override
	public void withdrawl() 
	{
		// TODO Auto-generated method stub
		System.out.println("hi iam withdrawl override method in hdfc class");
	}

}
