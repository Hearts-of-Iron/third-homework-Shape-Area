/**
 * Created by tengf on 2016/10/24.
 */
public abstract class AreaFunction {
    public abstract double Area();
}

class Triangle extends AreaFunction{
    public double base =0;
    public double height = 0;
    public Triangle(double base,double height){this.base=base;this.height=height;}

    @Override
    public double Area() { return (this.base*this.height*0.5);}
}

class Square extends AreaFunction {
    private double length = 0;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double Area() {
        return (this.length * this.length);
    }
}

class Circle extends AreaFunction{
    private double radius=0;
    private double pi=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double Area() {
        return (pi*this.radius*this.radius);
    }
}





