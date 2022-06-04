package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MobilePhoneManager {

    ArrayList<MobilePhone> mobilePhoneList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void run(){
        System.out.println("----------------------------------------------------");
        System.out.println("0 Exit");
        System.out.println("1 Add Mobile Phone");
        System.out.println("2 List Mobile Phone");
        System.out.println("3 Delete Mobile Phone");
        System.out.println("4 Filter List");
        System.out.println("Your Choice Of Id: ");

        int choice = input.nextInt();
        int keyMobile = 0;
        while(keyMobile == 0){
            switch (choice){
                case 0:
                    keyMobile = 1;
                    break;
                case 1:
                    addMobilePhone();
                    break;
                case 2:
                    printMobilePhone(mobilePhoneList);
                    break;
                case 3:
                    deleteMobilPhone();
                    break;
                case 4:
                    filterByIdMobilePhone();
                    break;
                default:
                    System.out.println("You entered wrong id.");
                    break;
            }
        }
    }
    public void addMobilePhone(){
        System.out.println("Enter the product specifications");
        int id = mobilePhoneList.size() - 1;

        System.out.println("RAM");
        int ram = input.nextInt();
        mobilePhoneList.get(id).setRAM(ram);

        System.out.println("Product name: ");
        String name = input.next();
        mobilePhoneList.get(id).setProductName(name);

        System.out.println("Screen size of the product: ");
        String screenSize = input.next();
        mobilePhoneList.get(id).setProductName(screenSize);

        System.out.println("Price of the product: ");
        double unitPrice = input.nextDouble();
        mobilePhoneList.get(id).setUnitPrice(unitPrice);

        System.out.println("Battery Power of the product: ");
        double batteryPower = input.nextDouble();
        mobilePhoneList.get(id).setBatteryPower(batteryPower);

        System.out.println("Stock of product: ");
        int stock = input.nextInt();
        mobilePhoneList.get(id).setStock(stock);

        System.out.println("Discount rate: ");
        int discountRate = input.nextInt();
        mobilePhoneList.get(id).setDiscountRate(discountRate);

        System.out.println("Enter color: ");
        String color = input.next();
        mobilePhoneList.get(id).setColor(color);

        System.out.println("Memory Information: ");
        int memory = input.nextInt();
        mobilePhoneList.get(id).setMemoryInformation(memory);

        System.out.println("Product brand: ");
        String brandName = input.next();
        mobilePhoneList.get(id).setBrand(new Brand(id,brandName));
    }

    public void deleteMobilPhone(){
        System.out.println("The product Id you want to be deleted: ");
        int deletedId = input.nextInt();
        if(deletedId < mobilePhoneList.size() && deletedId >= 0){
            mobilePhoneList.remove(deletedId);
            System.out.println("The product has been deleted.");
        }else{
            System.out.println("You entered an invalid id.");
        }
    }

    public void filterByIdMobilePhone(){
        System.out.println("Enter the product brand you want to filter: ");
        String filter= input.nextLine();
        ArrayList<MobilePhone> filterPhones = new ArrayList<>();
        for(MobilePhone phone: mobilePhoneList){
            if(filter.equals(phone.getBrand().getBrandName())){
                filterPhones.add(phone);
            }
        }
        printMobilePhone(filterPhones);
    }

    public void printMobilePhone(ArrayList<MobilePhone> phoneList){
        if(phoneList==null) phoneList=this.mobilePhoneList;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Id | Product Name                  | Price          | Brand         | Stock        | Discount Rate      | RAM    | Screen Size      | Memory Information   | Battery Power  | Color |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone phone:phoneList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    phone.getId(), phone.getProductName(), phone.getUnitPrice(), phone.getBrand().getBrandName(), phone.getStock(),
                    phone.getDiscountRate(),phone.getRAM(),phone.getScreenSize(), phone.getMemoryInformation(), phone.getBatteryPower(),
                    phone.getColor());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
