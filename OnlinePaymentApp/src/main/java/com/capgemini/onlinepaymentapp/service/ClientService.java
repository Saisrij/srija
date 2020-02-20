package com.capgemini.onlinepaymentapp.service;

import java.util.Map;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepaymentapp.dao.ClientDAO;
import com.capgemini.onlinepaymentapp.dao.IOnlinePaymentDAO;

public class ClientService implements IOnlinePaymentService {

	ClientDAO Number = new ClientDAO();
	 
	
	
	/**
	 * @return the number
	 */
	public IOnlinePaymentDAO getNumber() {
		return Number;
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(ClientDAO number) {
		Number = number;
	}
	public void setMap(Map<Integer, WalletAccount> map) {
		Number.setMap(map);
	}
	public Map<Integer, WalletAccount> getMap() {
		return Number.getMap();
	}


	public boolean fundTransfer() {
		// TODO Auto-generated method stub
		return Number.fundTransfer();
	}
public static boolean isValidAccountId(int accountId) {
		boolean flag = false;
		String account = accountId+"";
		flag = account.matches("[1-9][0-9]{8}");
		/*
		 * if ( accountId!= 0 && accountId >99 && accountId < 1000) { flag = true; }
		 * return flag;
		 */
		return flag;
	}

	public static boolean isValidAccountBalance(double accountBalance) {
		boolean flag = false;
		if (accountBalance>=1000) {
			flag = true;
		}
		return flag;
	}
	public static boolean isValidTransferAmount(double accountBalance,double amount) {
		boolean flag = false;
		if (accountBalance>=amount) {
			flag = true;
		}
		return flag;
}

	public static  boolean userValidations(WalletAccount c,double amount) {
		boolean flag = false;

		if (isValidAccountId(c.getAccountId()) && (isValidAccountBalance(c.getAccountBalance())&&(isValidTransferAmount(c.getAccountBalance(),amount)))) {
			flag = true;
		}
	return flag;	
	}

}
