package com.company;

import java.util.Scanner;

public class ProductManager {
    public static Scanner sc = new Scanner(System.in);
    private NotebookManager notebookManager = new NotebookManager();
    private MobilePhoneManager mobilePhoneManager = new MobilePhoneManager();

    public void run(){
        System.out.println("PatikaStore Product Management Panel !");
        System.out.println(" Id: 1 Notebook Transactions" +
                "\n Id: 2 Mobile Phone Transactions" +
                "\n Id: 3 Brand List" +
                "\n Id: 0 Exit");
    }

    public void choice(){
        boolean choice = true;
        while(choice) {
            System.out.print("Choice: ");
            int idChoice = sc.nextInt();
            switch (idChoice) {
                case 0:
                    System.out.println("You left the store!");
                    choice = false;
                    break;
                case 1:
                    System.out.println("Notebook Transactions");
                    notebookManager.run();
                    break;
                case 2:
                    System.out.println("Mobile Phone Transactions");
                    mobilePhoneManager.run();
                    break;
                case 3:
                    Brand.printBrand();
                    break;
                default:
                    System.out.println("Please enter a valid id.");
                    break;
            }
        }
    }
}
