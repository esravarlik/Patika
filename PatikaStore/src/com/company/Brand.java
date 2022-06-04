package com.company;

import java.util.TreeSet;

public class Brand implements Comparable<Brand> {
    private int id;
    private String brandName;
    private static TreeSet<Brand> brandList=new TreeSet<>();

    static{
        getBrandList();
    }
    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int compareTo(Brand o1) {
        return (this.getBrandName().compareTo(o1.getBrandName()));
    }
    public static void getBrandList(){

        brandList.add(new Brand(1,"Samsung"));
        brandList.add(new Brand(2,"Lenovo"));
        brandList.add(new Brand(3,"Apple"));
        brandList.add(new Brand(4,"Huawei"));
        brandList.add(new Brand(5,"Casper"));
        brandList.add(new Brand(6,"Asus"));
        brandList.add(new Brand(7,"HP"));
        brandList.add(new Brand(8,"Xiaomi"));
        brandList.add(new Brand(9,"Monster"));
        System.out.println("----------------------------");
    }

    public static void printBrand(){
        System.out.println("Brand List: ");
        brandList.stream().sorted();
        for(Brand brand: brandList){
            System.out.println(brand.getId() + " " + brand.getBrandName());
        }
        System.out.println("----------------------------");
    }

    //The user should filter and list the products
    // according to their brands.
    public static Brand getByBrandId(int id){
        for(Brand brand: brandList){
            if(id == brand.getId()){
                return brand;
            }
        }
        return null;
    }
}
