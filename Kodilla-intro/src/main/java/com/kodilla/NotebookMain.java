package com.kodilla;

public class NotebookMain {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000, 2014);
        System.out.println(notebook.price);
        System.out.println(notebook.weight);
        System.out.println(notebook.year);
        System.out.println(notebook.year + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkYear(); notebook.checkPrice();
        Notebook notebook2 = new Notebook(1000, 2500, 2016);
        System.out.println(notebook2.price);
        System.out.println(notebook2.weight);
        System.out.println(notebook2.year);
        System.out.println(notebook2.year + notebook2.price);
        notebook2.checkPrice();
        notebook2.checkWeight();
        notebook2.checkYear();
        notebook2.checkYear(); notebook2.checkPrice();
        Notebook notebook3 = new Notebook(1100, 3100, 2023);
        System.out.println(notebook3.price);
        System.out.println(notebook3.weight);
        System.out.println(notebook3.year);
        System.out.println(notebook3.year + notebook3.price);
        notebook3.checkPrice();
        notebook3.checkWeight();
        notebook3.checkYear();
        notebook3.checkYear(); notebook3.checkPrice();
    }
}
