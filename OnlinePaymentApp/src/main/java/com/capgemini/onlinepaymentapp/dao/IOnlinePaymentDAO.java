package com.capgemini.onlinepaymentapp.dao;

import com.capgemini.onlinepayment.bean.WalletAccount;

public interface IOnlinePaymentDAO {
	boolean doFundTransfer();

	WalletAccount getWalletByAccountId(int accountId);
}
