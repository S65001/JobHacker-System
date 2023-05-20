package org.example.task_1;

import java.util.Scanner;



public class BankApplication {
    private static final Bank bank=new Bank();
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        panel();
        while(true)
        {
            long random = (long) (Math.random()*1000000000);
            char button =scanner.next().charAt(0);
            if(button=='q'){

                break;

            }else if(button=='a'){

                String name= scanner.next();
                float balance= scanner.nextFloat();
                insertAccount(new Account(random,name,balance));

            }else if(button=='w'){

                float withdrawnMoney= scanner.nextFloat();
                long account= scanner.nextLong();
                bank.withdrawFromAccount(account,withdrawnMoney);

            }else if(button=='d'){
                float depositedMoney= scanner.nextFloat();
                long account= scanner.nextLong();
                bank.depositToAccount(account,depositedMoney);

            }else if(button=='k'){
                long account= scanner.nextLong();
                System.out.println(bank.displayAccount(account));
            }

        }
    }


    public static void panel(){
        System.out.println("******************Welcome to the bank******************");
        System.out.println("_______________________Services________________________");
        System.out.println("|         to make a new account press (a)              |");
        System.out.println("|               to withdraw press (w)                  |");
        System.out.println("|               to deposit press (d)                   |");
        System.out.println("|         to know your account details press (k)       |");
        System.out.println("|                 to quit press (q)                    |");
    }
    public static void insertAccount(Account account)
    {
        bank.addCustomer(account);
        System.out.println("your account number is: "+account.getAccountNumber());
    }
}
