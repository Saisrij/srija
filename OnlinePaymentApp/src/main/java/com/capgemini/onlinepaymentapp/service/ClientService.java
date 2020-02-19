package com.capgemini.onlinepaymentapp.service;

import com.capgemini.onlinepaymentapp.dao.ClientDAO;
import com.capgemini.onlinepaymentapp.dao.IOnlinePaymentDAO;

public class ClientService implements IOnlinePaymentService {

	IOnlinePaymentDAO Number = new ClientDAO();
	
	
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

}
