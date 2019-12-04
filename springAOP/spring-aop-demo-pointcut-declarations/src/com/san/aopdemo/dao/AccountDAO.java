package com.san.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.san.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass()+": Doing my db work: adding an account ");
		
	}
	
	public boolean doWork() {
		System.out.println(getClass()+": doWork");
		return false;
	}
	
}
