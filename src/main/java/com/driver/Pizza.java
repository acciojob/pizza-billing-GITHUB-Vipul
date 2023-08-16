package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean topping;
    private boolean extraCheese;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) this.setPrice(300);
        else this.setPrice(400);
    }



    public void setPrice(int price) {
        this.price = price;
        this.bill=""+price;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.bill= String.valueOf(Integer.parseInt(this.bill)+80);

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        this.bill= String.valueOf(Integer.parseInt(this.bill)+70);
        else
            this.bill= String.valueOf(Integer.parseInt(this.bill)+120);
    }

    public void addTakeaway(){
        // your code goes here
        this.bill= String.valueOf(Integer.parseInt(this.bill)+20);
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
