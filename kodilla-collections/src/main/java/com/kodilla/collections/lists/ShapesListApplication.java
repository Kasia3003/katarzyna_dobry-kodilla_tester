package com.kodilla.collections.lists;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.List;
public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (int n = 0; n < shapes.size(); n++)
            System.out.println(shapes.get(n));

        for (int n = 0; n < shapes.size(); n++) {
            Square square = shapes.get(n);
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
