package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean takeAway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.setPrice(300);
        else this.setPrice(400);
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public void setPrice(int price) {
        this.price = price;
        this.bill="Pizza Base Price:"+ price+"\n";;
    }

    public void setBill(String bill) {
        this.bill +=bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

            this.setBill("Extra Cheese Added: 80\n");
            this.price += 80;
        }



    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            this.setBill("Extra Topping Added: 70\n");
            this.price += 70;

        }
        else  {
            this.setBill("Extra Topping Added: 120\n");
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            this.setBill("Carry Bag Added: 20\n");
            this.price += 20;
            this.setTakeAway(true);
        }

    }

    public String getBill(){
        // your code goes here
        return this.bill+ "Total Price: "+ price +"\n";
    }
}
