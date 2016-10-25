/**
 * Created by tengf on 2016/10/24.
 */
public class Shape {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println(square.Area());

        Circle circle = new Circle(3);
        System.out.println(circle.Area());

        Triangle triangle = new Triangle(2,5);
        System.out.println(triangle.Area());
    }
}
