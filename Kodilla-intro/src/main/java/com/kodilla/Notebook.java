package com.kodilla;

public class Notebook {
    public static void main(String[] args) {
        int price;
        }
        Notebook notebook = new Notebook(600, 1000);
        System.out.println(notebook.price);
        notebook.checkPrice();
    public Notebook(int price) {
        this.price = price;
        }
    public void checkPrice() {
        if (this.price < 600)
        {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price <= 600 || notebook.price <= 1000)
        {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
}


