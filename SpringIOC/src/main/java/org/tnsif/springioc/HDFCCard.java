package org.tnsif.springioc;

public class HDFCCard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("HDFS depositing an amount 1 lak");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFS withdraw an amount 2la");
		
	}

}
