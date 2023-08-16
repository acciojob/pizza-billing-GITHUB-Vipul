package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean takeAway;
    private boolean addExtraCheese;
    private boolean addExtraToppings;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.setPrice(300);
        else this.setPrice(400);

        addExtraCheese = false;
        addExtraToppings = false;
        takeAway = false;
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
            if(!addExtraCheese) {
                this.setBill("Extra Cheese Added: 80\n");
                addExtraCheese=true;
            }
            this.price += 80;
        }



    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            if(!addExtraToppings) {
                this.setBill("Extra Topping Added: 70\n");
                addExtraCheese=true;
            }
            this.price += 70;

        }
        else  {
            if(!addExtraToppings) {
                this.setBill("Extra Topping Added: 120\n");
                addExtraCheese=true;
            }
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            this.setBill("Carry Bag Added: 20\n");

            this.setTakeAway(true);
            this.price += 20;
        }


    }

    public String getBill(){
        // your code goes here
        return this.bill+ "Total Price: "+ price +"\n";
    }
}
