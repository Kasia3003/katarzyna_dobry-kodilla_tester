package com.kodilla;

import com.kodilla.Notebook;

public class FirstClass
{public static void main(String[] args) {
    Notebook notebook = new Notebook(600, 1000);
    System.out.println(notebook.weight + " " + notebook.price);
    if (notebook.price < 900) {
    System.out.println("This notebook is cheap.");
    } else {
    System.out.println("This notebook is quite expensive.");
    }
    }
}