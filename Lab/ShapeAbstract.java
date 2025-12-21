abstract class Shape{
        
    String color;

    abstract double area();
    public abstract String toString();

    public Shape (String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    } 
}

class  Rectangle extends Shape{

    double length;
    double width;

    public Rectangle (String color, double length, double width){

        super(color);
        this.length = length;
        this.width = width;

    }
    
    @Override
    
    double area(){
        return length * width;
    }

    @Override
    
    public String toString(){
        return "Rectangle color is " + super.getColor() + " and the area is : " + area();
    }

}

class Circle extends Shape {

    double radius;

    public Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }
     
    @Override

    double area(){
        return 3.1416 * Math.pow(radius, 2);
    }

    @Override

    public String toString (){
        return "Circle color is " + super.getColor() + " and the area is : " + area();
    }
}

public class ShapeAbstract{
    public static void main(String[] args) {
        
        Shape s1 = new Rectangle("Blue", 2, 3);
        Shape s2 = new Circle("Green", 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}