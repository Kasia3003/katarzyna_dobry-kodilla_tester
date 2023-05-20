package com.kodilla;

public class Notebook {
    int weight;
    public Notebook(int weight) {
        this.weight = weight;
        Notebook notebook = new Notebook(600);
        System.out.println(notebook.weight);

        Notebook heavyNotebook = new Notebook(2000);
        System.out.println(heavyNotebook.weight);

        Notebook oldNotebook = new Notebook(1600);
        System.out.println(oldNotebook.weight);

    }
}
