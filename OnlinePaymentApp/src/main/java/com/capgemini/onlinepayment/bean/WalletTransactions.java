package com.capgemini.onlinepayment.bean;

import java.time.LocalDateTime;

public class WalletTransactions {
	private int transactionId;
	private String description;
	private LocalDateTime dateOfTransaction;
	private double amount;
	private double amountBalance;
	/**
	 * @return the transactionId
	 */
	public int getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the dateOfTransaction
	 */
	public LocalDateTime getDateOfTransaction() {
		return dateOfTransaction;
	}
	/**
	 * @param dateOfTransaction the dateOfTransaction to set
	 */
	public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the amountBalance
	 */
	public double getAmountBalance() {
		return amountBalance;
	}
	/**
	 * @param amountBalance the amountBalance to set
	 */
	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WalletTransactions [transactionId=" + transactionId + ", description=" + description
				+ ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount + ", amountBalance=" + amountBalance
				+ "]";
	}
	public WalletTransactions(int transactionId, String description, LocalDateTime dateOfTransaction, double amount,
			double amountBalance) {
		super();
		this.transactionId = transactionId;
		this.description = description;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.amountBalance = amountBalance;
	}
}
	