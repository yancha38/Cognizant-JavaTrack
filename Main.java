import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        Shape[] shapes = new Shape[5];
        for(int i = 0; i < 5; ++i){
            String shape = s.next();
            Shape shapeType = null;
            
            switch (shape) {
                case "Triangle": {
                    double base = s.nextDouble();
                    double height = s.nextDouble();
                    
                    shapeType = new Triangle();
                    ((Triangle) shapeType).setBase(base);
                    ((Triangle) shapeType).setHeight(height);
                    break;
                }
                case "Sphere": {
                    double radius = s.nextDouble();
                    
                    shapeType = new Sphere();
                    ((Sphere) shapeType).setRadius(radius);
                    break;
                }
                case "Rectangle": {
                    double length = s.nextDouble();
                    double width = s.nextDouble();
                    
                    shapeType = new Rectangle();
                    ((Rectangle) shapeType).setLength(length);
                    ((Rectangle) shapeType).setWidth(width);
                    break;
                }
                case "Cube": {
                    double length = s.nextDouble();
                    double width = s.nextDouble();
                    double height = s.nextDouble();
                    
                    shapeType = new Cube();
                    ((Cube) shapeType).setLength(length);
                    ((Cube) shapeType).setWidth(width);
                    ((Cube) shapeType).setHeight(height);
                    break;
                }
            }
            shapes[i] = shapeType;
        }
        for(Shape shapeR : shapes){
            System.out.println("Area " + shapeR.area());
                
            if(shapeR instanceof Spatial) {
                double volume = shapeR.volume();
                System.out.println("Volume " + volume);
            }
        }
    }
}
    
    
    
    
    
    
    