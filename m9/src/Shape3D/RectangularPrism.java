package Shape3D;


 class RectangularPrism extends Shape3D { 
    private double length; 
    private double width; 
    private double height;

    public  RectangularPrism() { 
      length=0;
      width=0;
      height=0;
    }
    public  RectangularPrism(double l,double w,double h){

            length=l;
            width=w;
            height=h;
    }
     
       public double getLength() { 
      // write code here  length * width * height;
      return length; 
    }

    public double getWidth() { 
       // write code here 
       return width;
    }

     public double getHeight() { 
        return height; 
    }

    public double getArea() { 
       return 2*length*width+width*height+length*height;
       }
      
    public double getVolume() { 
       // write code here 
    return (length*width*height);
    }

    public String toString() { 
        return "For this rectangular prism the base has the length = " + length + " and the width = " + width + "\nThe height of the prism = " + height; 
    }

    public boolean equals(Object obj) { 
      // write code here use instance of operator
        if (obj instanceof Shape3D ) {
           RectangularPrism other = (RectangularPrism) obj;
            return  length== other.length && width==other.width && height==other.height; 
        } 
        else 
            return false; 
    } 
    } 
