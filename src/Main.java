import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShapeType type1 = new ShapeType();
        type1.name = "Rectangle";
        Shape shape = new Shape();
        shape.setX(5);
        shape.setY(5);
        shape.setType(type1);
        Shape shape2 = shape.clone();
        //shape2.clone(shape);

        type1.name = "Circle";
        shape2.getType().print();
        System.out.println("Length of the "+ shape2.getType().getName() + " : " + shape2.getX());

        System.out.println("Width of the "+ shape2.getType().getName() + " : " + shape2.getY());

        Shape shape3 = shape2.clone();
        shape2.setX(18);
        shape2.setY(18);
        type1.name = "Triangle";
        shape2.setType(type1);

        shape2.getType().print();
        System.out.println("Length of the "+ shape2.getType().getName() + " : " + shape2.getX());

        System.out.println("Width of the "+ shape2.getType().getName() + " : " + shape2.getY());








    }
}