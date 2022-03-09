public class Tank {

    private int x, y;
    private int dir=0;
    private int fuel;
    private int n;
    static final String model = "T34";
    static int tankNumber;

    public Tank() {
        /*this.x = 0;
        this.y = 0;
        this.fuel = 0;*/
        this (0, 0, 100);
    }

    public Tank(int x, int y) {
        /*this.x = x;
        this.y = y;
        this.fuel = 0;*/
        this (x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        ++tankNumber;
        n = tankNumber;
    }

    public void goForward(int i) {
        if (i > fuel) {
            i = fuel;
        } else if (fuel == 0) {
            i = 0;
        }
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }
    public void printPosition() {
        System.out.println("The Tank " + model + "-" + n + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward( - i);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }

    public int getFuel() {
        return fuel;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
