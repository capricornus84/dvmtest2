public class Main {
    public static void main(String[] args) {
/*
Make (add code to class Tank),
which can turn around
*/
// В (0;0) с fuel = 100
        Tank justTank = new Tank();
// В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);
// В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.

*/
    }

}