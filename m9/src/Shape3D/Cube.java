package Shape3D;

class Cube extends RectangularPrism { 
    private double length;
    public Cube() { 
    // write code here 
    length=0;
    
    }

    public Cube(double size) { 
    // write code here 
    length=size;
    }
    
    public double getArea() { 
       return 6*length*length;
       }
      
    public double getVolume() { 
       // write code here 
    return (length*length*length);
    }
    public String toString() { 
        return "For this cube all sides = " + super.getLength(); 
    } 
}