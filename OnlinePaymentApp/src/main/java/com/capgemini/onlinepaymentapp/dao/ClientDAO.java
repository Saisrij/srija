package com.capgemini.onlinepaymentapp.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepayment.bean.WalletTransactions;

public class ClientDAO implements IOnlinePaymentDAO {

	List<WalletTransactions> list = new ArrayList<WalletTransactions>();

	list.add(new WalletTransactions(101,"yyy",LocalDate.now(),2000,200));
	list.add(new WalletTransactions());
	list.add(new WalletTransactions());
	list.add(new WalletTransactions());
	Map<Integer, WalletAccount> map = new HashMap<Integer, WalletAccount>();

	public Map<Integer, WalletAccount> getMap() {
		return map;
	}

	public void setMap(Map<Integer, WalletAccount> map) {
		this.map = map;
	}

	public boolean fundTransfer() {

			WalletAccount account = map.put(101, new WalletAccount(101, 9000,Transclist ));

			System.out.println(account);

			map.put(102, new WalletAccount(102, 8000,Transclist  ));
			map.put(103, new WalletAccount(103, 7000,Transclist ));
			
		
}
	return false;

}