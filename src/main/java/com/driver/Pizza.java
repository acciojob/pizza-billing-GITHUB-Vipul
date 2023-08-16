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
        if(isVeg) {
            price = 300;
            bill="Pizza Base Price: 300\n";
        }
        else {
            price = 400;
            bill="Pizza Base Price: 400\n";
        }

        addExtraCheese = false;
        addExtraToppings = false;
        takeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            if(!addExtraCheese) {
                this.price += 80;
                bill+="Extra Cheese Added: 80\n";
                addExtraCheese=true;
            }


        }



    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings) {
            if(isVeg) {
                bill+="Extra Topping Added: 70\n";
                this.price += 70;
            }

           else {

                bill+="Extra Topping Added: 120\n";
                this.price += 120;
            }
            addExtraCheese=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            bill+="Carry Bag Added: 20\n";
            takeAway=true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill + "Total Price: "+ price +"\n";
    }
}
