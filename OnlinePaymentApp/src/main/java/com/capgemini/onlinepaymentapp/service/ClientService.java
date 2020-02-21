package com.capgemini.onlinepaymentapp.service;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepaymentapp.dao.ClientDAO;

public class ClientService implements IOnlinePaymentService {

	private ClientDAO clientDAO = new ClientDAO();

	public void doFundTransfer() {
		 clientDAO.doFundTransfer();
	}

	public static boolean isValidAccountId(int accountId) {
		boolean flag = false;
		String account = accountId + "";
		flag = account.matches("[1-9][0-9]{8}");
		/*
		 * if ( accountId!= 0 && accountId >99 && accountId < 1000) { flag = true; }
		 * return flag;
		 */
		return flag;
	}

	public static boolean isValidAccountBalance(double accountBalance) {
		boolean flag = false;
		if (accountBalance >= 1000) {
			flag = true;
		}
		return flag;
	}

	public static boolean isValidTransferAmount(double accountBalance, double amount) {
		boolean flag = false;
		if (accountBalance >= amount) {
			flag = true;
		}
		return flag;
	}

	public static boolean userValidations(WalletAccount c, double amount) {
		boolean flag = false;

		if (isValidAccountId(c.getAccountId()) && (isValidAccountBalance(c.getAccountBalance())
				&& (isValidTransferAmount(c.getAccountBalance(), amount)))) {
			flag = true;
		}
		return flag;
	}

	public WalletAccount getWalletByAccountId(int accountId) {
		return clientDAO.getWalletByAccountId(accountId);
	}
	public void updateWalletMap(int accountNumber, WalletAccount a)
	{
		clientDAO.updateWalletMap(accountNumber, a);
	}

}
