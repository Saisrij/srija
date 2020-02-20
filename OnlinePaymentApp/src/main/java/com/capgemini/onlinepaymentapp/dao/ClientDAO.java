package com.capgemini.onlinepaymentapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepayment.bean.WalletTransactions;

public class ClientDAO implements IOnlinePaymentDAO {
	List<WalletTransactions> list = new ArrayList<WalletTransactions>();
	List<Integer> l = new ArrayList<Integer>();

	Map<Integer, WalletAccount> map = new HashMap<Integer, WalletAccount>();

	public Map<Integer, WalletAccount> getMap() {
		return map;
	}

	public void setMap(Map<Integer, WalletAccount> map) {
		this.map = map;
	}

	public boolean fundTransfer() {
		list.add(new WalletTransactions());
		list.add(new WalletTransactions());
		list.add(new WalletTransactions());
		list.add(new WalletTransactions());
		map.put(101, new WalletAccount(101, 9000, list));
		map.put(102, new WalletAccount(102, 20000, list));
		map.put(103, new WalletAccount(103, 50000, list));
		map.put(104, new WalletAccount(104, 4000, list));
		return false;
	}
}
