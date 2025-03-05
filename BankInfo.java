package org.bank;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("this account type is savings");

	}

	public void fixed() {
		System.out.println("this account type is fixed");

	}

	@Override
	public void deposite() {
		System.out.println("this account type is" + ""
				+ " deposite in the bankinfo");
	}

	public static void main(String[] args) {

		BankInfo bi = new BankInfo();

		bi.saving();
		bi.fixed();
		bi.deposite();

	}

}
