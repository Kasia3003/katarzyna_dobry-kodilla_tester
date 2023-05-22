package com.kodilla;

import com.kodilla.Notebook;

public class FirstClass
{public static void main(String[] args) {
    Notebook notebook = new Notebook(600,1000);
    System.out.printIn("notebook.weight: " + notebook.weight);
    System.out.printIn("notebook.price: " + notebook.price);
    Notebook heavyNotebook = new Notebook (2000, 1500);
    System.out.printIn("heavyNotebook.weight:" + heavyNotebook.weight);
    System.out.printIn("heavyNotebook.price:" + heavyNotebook.price);
    Notebook oldNotebook = new Notebook (1200,500);
    System.out.printIn("oldNotebook.weight:" + oldNotebook.weight);
    System.out.printIn("oldNotebook.price:" + oldNotebook.price);
}
}
