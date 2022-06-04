package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class NotebookManager {
    ArrayList<Notebook> notebookList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void run(){
        System.out.println("----------------------------------------------------");
        System.out.println("0 Exit");
        System.out.println("1 Add Notebook");
        System.out.println("2 List Notebook");
        System.out.println("3 Delete Notebook");
        System.out.println("4 Filter List");
        System.out.println("Your Choice Of Id: ");

        int choice = input.nextInt();
        int keyNotebook = 0;
        while(keyNotebook == 0){
            switch (choice){
                case 0:
                    keyNotebook = 1;
                    break;
                case 1:
                    addNotebook();
                    break;
                case 2:
                    printNotebook(notebookList);
                    break;
                case 3:
                    deleteNotebook();
                    break;
                case 4:
                    filterByIdNotebook();
                    break;
                default:
                    System.out.println("You entered wrong id.");
                    break;
            }
        }
    }
    public void listNotebook(){
    }

    public void addNotebook(){
        System.out.println("Enter the product specifications");
        int id = notebookList.size() +1;

        System.out.println("RAM");
        int ram = input.nextInt();
        notebookList.get(id).setRAM(ram);

        System.out.println("Product name: ");
        String name = input.next();
        notebookList.get(id).setProductName(name);

        System.out.println("Screen size of the product: ");
        String screenSize = input.next();
        notebookList.get(id).setProductName(screenSize);

        System.out.println("Price of the product");
        double unitPrice = input.nextDouble();
        notebookList.get(id).setUnitPrice(unitPrice);

        System.out.println("Stock of product: ");
        int stock = input.nextInt();
        notebookList.get(id).setStock(stock);

        System.out.println("Discount rate: ");
        int discountRate = input.nextInt();
        notebookList.get(id).setDiscountRate(discountRate);

        System.out.println("Product brand : ");
        String brandName = input.next();
        notebookList.get(id).setBrand(new Brand(id,brandName));

    }

    public void deleteNotebook(){
        System.out.println("The product Id you want to be deleted: ");
        int deletedId = input.nextInt();
        if(deletedId < notebookList.size() && deletedId >= 0){
            notebookList.remove(deletedId);
            System.out.println("The product has been deleted.");
        }else{
            System.out.println("You entered an invalid id.");
        }
    }

    public void filterByIdNotebook(){
        System.out.println("Enter the product brand you want to filter: ");
        String filter= input.nextLine();
        ArrayList<Notebook> filterNotebook = new ArrayList<>();
        for(Notebook notebook: notebookList){
            if(filter.equals(notebook.getBrand().getBrandName())){
                filterNotebook.add(notebook);
            }
        }
        printNotebook(filterNotebook);
    }

    public void printNotebook(ArrayList<Notebook> phoneList){
        if(phoneList==null) phoneList=this.notebookList;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Id | Product Name                  | Price          | Brand         | Stock        | Discount Rate      | RAM    | Screen Size      | Memory Information   |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook notebook : phoneList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    notebook.getId(), notebook.getProductName(), notebook.getUnitPrice(), notebook.getBrand().getBrandName(), notebook.getStock(),
                    notebook.getDiscountRate(), notebook.getRAM(), notebook.getScreenSize());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
