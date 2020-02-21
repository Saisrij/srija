package com.capgemini.onlinepaymentapp.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepayment.bean.WalletTransactions;
import com.capgemini.onlinepaymentapp.service.ClientService;

public class PaymentUser {

	public static void main(String[] args) {
		while (true) {
			ClientService service = new ClientService();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1.Transaction Details");
			System.out.println("2.Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:

				int fromAccountNumber = 123456789;//scan.nextInt();
				double amount = 100;//scan.nextDouble();
				int toAccountNumber = 234567891;//scan.nextInt();

				WalletAccount a1 = service.getWalletByAccountId(fromAccountNumber);
				WalletAccount a2 = service.getWalletByAccountId(toAccountNumber);
				if(a1==null||a2==null)
				{
					System.out.println("Invalid Account Details");
					return;
				}
				boolean isValid = ClientService.userValidations(a1, amount);
				if (isValid == true) {
					System.out.println("All the details entered are correct");
				} else {
					System.out.println("Details entered are incorrect");
					return;
				}
				double newBalance1 = a1.getAccountBalance() - amount;
				double newBalance2 = a2.getAccountBalance() + amount;
				a1.setAccountBalance(newBalance1);
				a2.setAccountBalance(newBalance2);
				a1.getTransactionHistory();
				int count = 1;
				List<WalletTransactions> list = new ArrayList<WalletTransactions>();
				WalletTransactions ts1 = new WalletTransactions();// list.get(count - 1);
				ts1.setTransactionId(10001);
				ts1.setDescription("Transaction is processing");
				ts1.setDateOfTransaction(LocalDateTime.now());
				ts1.setAmount(700);
				ts1.setAmountBalance(newBalance1);
				// list.remove(count - 1);
				list.add(count - 1, ts1);
				a1.setTransactionHistory(list);
				list.remove(count - 1);
				ts1.setTransactionId(10002);
				ts1.setDateOfTransaction(LocalDateTime.now());
				ts1.setAmount(700);
				ts1.setAmountBalance(newBalance2);
				// list.remove(count - 1);
				list.add(count - 1, ts1);
				a2.setTransactionHistory(list);
				ts1.setDescription("Amount is credited");
				list.remove(count - 1);
				service.updateWalletMap(fromAccountNumber, a1);
				service.updateWalletMap(toAccountNumber, a2);
				// clientDAOobj.setMap(map);
				System.out.println("After transaction ");
				System.out.println("From Account Details--------");
				System.out.println(service.getWalletByAccountId(fromAccountNumber));
				
				System.out.println("To Account Details");
				System.out.println(service.getWalletByAccountId(toAccountNumber));
				break;

			default:
				System.out.println("Invalid Transactionid");
				break;

			}

		}

	}
}