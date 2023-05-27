package com.kodilla;

public class Notebook {

    int price;
    int weight;
    int year;

    public Notebook(int price, int weight, int year) {
        this.price = price;
        this.weight = weight;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price <= 600 || this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 2000) {
            System.out.println("This notebook is very light.");
        }
        if (this.weight <= 2000 || this.weight <= 3000) {
            System.out.println("This weight is good.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year < 2015) {
            System.out.println("This notebook is very old.");
        }
        if (this.year <= 2015 || this.year <= 2021) {
            System.out.println("This notebook is not so old.");
        } else {
            System.out.println("This notebook is new.");
        }
    }

    {
        if (this.year < 2015 && this.price < 600) {
            System.out.println("Do not buy this notebook.");
        }
        if (this.year <= 2015 || this.year <= 2021 && this.price <= 600 || this.price <= 2000) {
            System.out.println("You can think about buying this notebook.");
        } else {
            System.out.println("Go ahead, buy!");
        }
    }

    }







