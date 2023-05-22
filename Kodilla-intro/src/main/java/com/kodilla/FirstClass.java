package com.kodilla;

import com.kodilla.Notebook;

public class FirstClass
{public static void main(String[] args) {
    Notebook notebook = new Notebook(600,1000);
    System.out.println("notebook.weight: " + notebook.weight);
    System.out.println("notebook.price: " + notebook.price);
    Notebook heavyNotebook = new Notebook (2000, 1500);
    System.out.println("heavyNotebook.weight:" + heavyNotebook.weight);
    System.out.println("heavyNotebook.price:" + heavyNotebook.price);
    Notebook oldNotebook = new Notebook (1200,500);
    System.out.println("oldNotebook.weight:" + oldNotebook.weight);
    System.out.println("oldNotebook.price:" + oldNotebook.price);
}
}
