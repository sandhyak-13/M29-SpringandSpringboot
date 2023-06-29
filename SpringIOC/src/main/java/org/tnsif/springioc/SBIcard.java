package org.tnsif.springioc;

public class SBIcard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("depositing an amount");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw an amount");
		
	}

}
