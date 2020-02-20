package com.capgemini.onlinepaymentapp.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.onlinepayment.bean.WalletAccount;
import com.capgemini.onlinepayment.bean.WalletTransactions;
import com.capgemini.onlinepaymentapp.dao.ClientDAO;
import com.capgemini.onlinepaymentapp.service.ClientService;

public class PaymentUser {

	public static void main(String[] args) 
	{
		while (true) {
			ClientService service = new ClientService();
			//ClientDAO clientDAOobj = new ClientDAO();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1.Transaction Details");
			System.out.println("2.Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				service.fundTransfer();
				 Map map = service.getMap();
				//Map map = clientDAOobj.getMap();
				System.out.println("Before Transaction");
				System.out.println(map);
				System.out.println("Enter From Account Number");
				int fromAccountNumber = scan.nextInt();
				System.out.println("Amount to be Transfer");
				double amount = scan.nextDouble();
				System.out.println("Enter To Account Number");
				int toAccountNumber = scan.nextInt();
				
				WalletAccount a1 = null;
				WalletAccount a2 = null;
				Set<Integer> set = map.keySet();
				for (Integer key : set) {
					if (key.equals(fromAccountNumber)) {
						a1 = (WalletAccount) map.get(key);
					}
					if (key.equals(toAccountNumber)) {
						a2 = (WalletAccount) map.get(key);
					}
				}
				boolean isValid = ClientService.userValidations(a1,amount);
				if (isValid == true) {
					System.out.println("All the details entered are correct");
				} 
				else {
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
				WalletTransactions ts1 = new WalletTransactions();//list.get(count - 1);
				ts1.setTransactionId(10001);
				ts1.setDescription("Transaction is processing");
				ts1.setDateOfTransaction(LocalDateTime.now());
				ts1.setAmount(700);
				ts1.setAmountBalance(newBalance1);
				//list.remove(count - 1);
				list.add(count - 1, ts1);
				a1.setTransactionHistory(list);
				list.remove(count - 1);
				ts1.setTransactionId(10002);
				ts1.setDateOfTransaction(LocalDateTime.now());
				ts1.setAmount(700);
				ts1.setAmountBalance(newBalance2);
				//list.remove(count - 1);
				list.add(count - 1, ts1);
				a2.setTransactionHistory(list);
				ts1.setDescription("Amount is credited");
				list.remove(count-1);
				map.put(fromAccountNumber, a1);
				map.put(toAccountNumber, a2);
				service.setMap(map);
				//clientDAOobj.setMap(map);
				System.out.println("After transaction ");
				System.out.println(map);
				break;

			default:
				System.out.println("Invalid Transactionid");
				break;

			}

		}

	}
}