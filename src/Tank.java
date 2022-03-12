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
        int nSign = 0;
        if (i<0) {
            nSign = -1;
        } else if (i==0) {
            nSign = 0;
        } else if (i>0) {
            nSign = 1;
        }
        if (Math.abs(i) > fuel) {
            i = nSign * fuel;
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
        int nSign = 0;
        if (i<0) {
            nSign = -1;
        } else if (i==0) {
            nSign = 0;
        } else if (i>0) {
            nSign = 1;
        }
        System.out.println("equal " + i + " " + Math.abs(i) + " " + fuel);
        if (Math.abs(i) > fuel) {
            i = nSign * fuel;
        } else if (fuel == 0) {
            i = 0;
        }
        //i = -1 * i;
        turnLeft();
        turnLeft();
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

}
