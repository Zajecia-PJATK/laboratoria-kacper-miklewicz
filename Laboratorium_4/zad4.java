class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double p) {
        radius = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String col) {
        color = col;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color='" + color + "']";
    }
}

class Cylinder extends Circle {
    double height;
    public Cylinder() {
        super();
        height = 1;
    }
    
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    
    public Cylinder(double radius, double height) {
        super(radius, "red");
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        return this.getArea() * this.getHeight();
    }
}
