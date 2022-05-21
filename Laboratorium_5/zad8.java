class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 5, 10);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint[x=" + this.x
                + ", y=" + this.y
                + ", xSpeed=" + this.xSpeed +
                ", ySpeed=" + this.ySpeed + "]";
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("Point position changed (x=" + this.x + ", y=" + this.y + ")");
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("Point position changed (x=" + this.x + ", y=" + this.y + ")");
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("Point position changed (x=" + this.x + ", y=" + this.y + ")");
    }

    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("Point position changed (x=" + this.x + ", y=" + this.y + ")");
    }
}
