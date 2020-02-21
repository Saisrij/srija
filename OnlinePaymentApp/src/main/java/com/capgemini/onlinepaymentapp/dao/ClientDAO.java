package com.capgemini.onlinepaymentapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepayment.bean.WalletTransactions;

public class ClientDAO implements IOnlinePaymentDAO {
	
	List<WalletTransactions> walletTransactions = new ArrayList<WalletTransactions>();

	private Map<Integer, WalletAccount> accountIdWalletMap = new HashMap<Integer, WalletAccount>();

	public boolean doFundTransfer() {
		walletTransactions.add(new WalletTransactions());
		walletTransactions.add(new WalletTransactions());
		walletTransactions.add(new WalletTransactions());
		walletTransactions.add(new WalletTransactions());
		accountIdWalletMap.put(123456789, new WalletAccount(123456789, 9000, walletTransactions));
		accountIdWalletMap.put(234567891, new WalletAccount(234567891, 20000, walletTransactions));
		accountIdWalletMap.put(345678912, new WalletAccount(345678912, 50000, walletTransactions));
		accountIdWalletMap.put(456789012, new WalletAccount(456789012, 4000, walletTransactions));
		return false;
	}

	public WalletAccount getWalletByAccountId(int accountId) {
		if (accountIdWalletMap.containsKey(accountId)) {
			return accountIdWalletMap.get(accountId);
		}
		return null;
	}
	
	public void updateWalletMap(int accountNumber, WalletAccount a)
	{
		accountIdWalletMap.put(accountNumber, a);
	}
}
