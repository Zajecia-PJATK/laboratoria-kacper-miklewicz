class Main {
    public static void main(String[] args) {
        segmentToStringTest();
        triangleToStringTest();
        getDistancesTest();
        getLengthTest();
        getTypeTest();
    }

    public static void segmentToStringTest() {
        Segment segment = new Segment(new Point(0, 3), new Point(4, 0));
        String expected = "Segment[v1=(0,3),v2=(4,0)]";
        String result = segment.toString();

        if (expected.equals(result)) {
            System.out.println("Segment toString() test: passed");
        }
        else {
            System.out.println("Segment toString() test: not passed.");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }

    }

    public static void triangleToStringTest() {
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        String expected = "Triangle[v1=(1,2),v2=(3,4),v3=(5,6)]";
        String result = triangle.toString();

        if (expected.equals(result)) {
            System.out.println("Triangle toString() test: passed");
        } else {
            System.out.println("Triangle toString() test: not passed");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }

    public static void getDistancesTest() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
        double expected = 12;
        double result = triangle.getDistances();

        if (expected == result) {
            System.out.println("Triangle getDistances() test: passed");
        } else {
            System.out.println("Triangle getDistances(): not passed");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }

    public static void getLengthTest() {
        Segment segment = new Segment(new Point(11, 0), new Point(0, 60));
        double expected = 61;
        double result = segment.getLength();

        if (expected == result) {
            System.out.println("Segment getLength() test: passed");
        } else {
            System.out.println("Segment getLength() test: not passed");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }

    public static void getTypeTest() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));
        String expected = "równoramienny";
        String result = triangle.getType();

        if (expected.equals(result)) {
            System.out.println("Triangle getType() test: passed");
        } else {
            System.out.println("Triangle getType() test: not passed");
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }
}

class Point {
    private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point getCoordinates() {
        return new Point(x, y);
    }

    public void setCoordinates(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setCoordinates(Point p) {
        this.setCoordinates(p.getX(), p.getY());
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2) + Math.pow(p.getY() + this.getY(), 2));
    }
}

class Segment {
    private Point v1;
    private Point v2;

    public Segment(Point v1, Point v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public String toString() {
        return "Segment[v1=(" + getV1().getX() + "," + getV1().getY() + "),v2=(" + getV2().getX() + "," + getV2().getY() + ")]";
    }

    public double getLength() {
        return v1.distance(v2);
    }
}

class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public Point getV3() {
        return v3;
    }

    public String toString() {
        return "Triangle[v1=(" + getV1().getX() + "," + getV1().getY() + "),v2=(" + getV2().getX() + "," + getV2().getY() + "),v3=(" + getV3().getX() + "," + getV3().getY() + ")]";
    }

    public double getDistances() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double aLength = v1.distance(v2);
        double bLength = v2.distance(v3);
        double cLength = v1.distance(v3);

        if (aLength == bLength && aLength == cLength && bLength == cLength) return "równoboczny";
        else if (aLength == bLength || aLength == cLength || bLength == cLength) return "równoramienny";
        else return "różnoboczny";
    }
}
