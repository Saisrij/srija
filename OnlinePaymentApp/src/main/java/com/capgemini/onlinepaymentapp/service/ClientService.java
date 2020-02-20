package com.capgemini.onlinepaymentapp.service;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepaymentapp.dao.ClientDAO;
import com.capgemini.onlinepaymentapp.dao.IOnlinePaymentDAO;

public class ClientService implements IOnlinePaymentService {

	IOnlinePaymentDAO Number = new ClientDAO();
	 static double amount;
	
	
	/**
	 * @return the number
	 */
	public IOnlinePaymentDAO getNumber() {
		return Number;
	}


	/**
	 * @param number the number to set
	 */
	public void setNumber(IOnlinePaymentDAO number) {
		Number = number;
	}


	public boolean fundTransfer() {
		// TODO Auto-generated method stub
		return Number.fundTransfer();
	}
public static boolean isValidAccountId(int accountId) {
		boolean flag = false;
	if ( accountId!= 0 && accountId >99 && accountId < 1000) {
		flag = true;
		}
		return flag;
	}

	public static boolean isValidAccountBalance(double accountBalance) {
		boolean flag = false;
		if (accountBalance>=1000) {
			flag = true;
		}
		return flag;
	}
	public static boolean isValidTransferAmount(double accountBalance) {
		boolean flag = false;
		if (accountBalance>=amount) {
			flag = true;
		}
		return flag;
}

	public static  boolean userValidations(WalletAccount c) {
		boolean flag = false;

		if (isValidAccountBalance(c.getAccountId()) && (isValidAccountBalance(c.getAccountBalance())&&(isValidTransferAmount(c.getAccountBalance())))) {
			flag = true;
		}
	return flag;	
	}

}
