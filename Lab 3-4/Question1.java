public class MainGeometricObject {
    public static void main(String[] args) {
        GeometricObject g = new GeometricObject("blue", true);
        Circle c1 = new Circle();
        Circle c2 = new Circle(9, "black", false);
        Rectangle r = new Rectangle(4, 8, "green", true);

        System.out.println(g);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r);
    }
}

// --------------------- GeometricObject CLASS ---------------------
class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", filled=" + filled + "]";
    }
}

// --------------------- Circle CLASS ---------------------
class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}

// --------------------- Rectangle CLASS ---------------------
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
}

