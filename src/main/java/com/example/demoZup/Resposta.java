package com.example.demoZup;

public class Resposta {
	
	private final long id;
	private final int overdraft;
	private final int credit;
	private final int investments;
	
	public Resposta (long id){
		this.id = id;
		this.overdraft = 4850;
		this.credit = 22500;
		this.investments = 50000;
	}

	public long getId() {
		return id;
	}

	public int getOverdraft() {
		return overdraft;
	}

	public int getCredit() {
		return credit;
	}

	public int getInvestments() {
		return investments;
	}

	
	

}
