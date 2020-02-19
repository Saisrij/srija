package com.capgemini.onlinepayment.bean;

import java.util.List;

public class WalletAccount {
private int accountId;
private double accountBalance;
private List<WalletTransactions> transactionHistory;
public WalletAccount(int accountId, double accountBalance, List<WalletTransactions> transactionHistory) {
	super();
	this.accountId = accountId;
	this.accountBalance = accountBalance;
	this.transactionHistory = transactionHistory;
}
/**
 * @return the accountId
 */
public int getAccountId() {
	return accountId;
}
/**
 * @param accountId the accountId to set
 */
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
/**
 * @return the accountBalance
 */
public double getAccountBalance() {
	return accountBalance;
}
/**
 * @param accountBalance the accountBalance to set
 */
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
/**
 * @return the transactionHistory
 */
public List<WalletTransactions> getTransactionHistory() {
	return transactionHistory;
}
/**
 * @param transactionHistory the transactionHistory to set
 */
public void setTransactionHistory(List<WalletTransactions> transactionHistory) {
	this.transactionHistory = transactionHistory;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "WalletAccount [accountId=" + accountId + ", accountBalance=" + accountBalance + ", transactionHistory="
			+ transactionHistory + "]";
}
}
