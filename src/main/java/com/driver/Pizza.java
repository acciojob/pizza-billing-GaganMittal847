package com.driver;

public class Pizza {

    private int price;
    private int toppings;
    private int cheese;
    private Boolean isVeg;
    private String bill;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill=" ";
        this.isBillGenerated=false;
        this.isTakeAwayAdded=false;
        this.isExtraToppingAdded=false;
        this.isExtraCheeseAdded=false;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price =400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price+=cheese;
            this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price+=toppings;
            this.isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price+=20;
            this.isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheeseAdded) this.bill+="Extra Chesse Added: "+this.cheese+"\n";
            if(isExtraToppingAdded) this.bill+="Extra Topping Added: "+this.toppings+"\n";
            if(isTakeAwayAdded) this.bill+="Paperbag Added: "+"20"+"\n";
            this.bill+="Total Price: "+this.price+"\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
