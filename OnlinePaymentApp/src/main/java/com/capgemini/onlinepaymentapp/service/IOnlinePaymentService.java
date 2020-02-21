package com.capgemini.onlinepaymentapp.service;

import com.capgemini.onlinepayment.bean.WalletAccount;

public interface IOnlinePaymentService {
	void doFundTransfer();

	WalletAccount getWalletByAccountId(int accountId);
}
