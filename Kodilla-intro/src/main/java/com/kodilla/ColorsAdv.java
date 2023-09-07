package com.kodilla;

public class ColorsAdv {
    public String review() {
        String colorSelected = Colors.getColorSelection();
        String blue = Colors.getColorSelection();
        String red = Colors.getColorSelection();
        String green = Colors.getColorSelection();
        String yellow = Colors.getColorSelection();

        return switch (colorSelected) {
            case "B" -> blue;
            case "R" -> red;
            case "G" -> green;
            case "Y" -> yellow;
            default -> null;

        };
    }
}
