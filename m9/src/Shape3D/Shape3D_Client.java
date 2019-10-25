package Shape3D;

public class Shape3D_Client { 
    public static final int MAX = 6; 
    public static void main(String[] args) { 
        Shape3D[] shapes = new Shape3D[MAX]; 
          
        shapes[0]=new Cube(20);
        shapes[1]=new Squarepyramid(10,30);
        shapes[2]=new RectangularPrism(10,20,40);
        shapes[3]=new Sphere(3);
        System.out.println(shapes[0].getArea());
        System.out.println(shapes[0].getVolume());
        System.out.println(shapes[1].getVolume());
        System.out.println(shapes[2].getArea());
        System.out.println(shapes[3].getArea());
    }
}