package Shape3D;

public class Squarepyramid extends Shape3D {
    private double length; 
    private double height;

    public void SquarePyramid() {
        length = 0; 
        height = 0; 
    } 
    public Squarepyramid(double l, double h) {
        length = l; 
        height = h; 
    }

    public double getLength() { 
        return length; 
    }

    public double getHeight() { 
        return height; 
    }

    public double getArea() { 
           // write code here   length * (length + Math.sqrt(length * length + 4 * height * height)); 
           return length*(length+Math.sqrt(length*length)+4*height*height);
    }

    public double getVolume() { 
          // write code here  length * length * height / 3.0; 
          return length*length*height/3.0;
    }

    public String toString() { 
        return "For this square pyramid the base has the length = " + length + " and the height = " + height; 
    }

    public boolean equals(Object obj) { 
        if (obj instanceof Squarepyramid) {
            Squarepyramid other = (Squarepyramid) obj;
            return length == other.length && height == other.height; 
        } 
        else 
            return false; 
    } 

    
}