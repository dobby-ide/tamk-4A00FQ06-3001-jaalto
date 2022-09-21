//2.3 Coordinate class
//
//Implement Coordinate.java class that holds three dimensional
//        object in the coordinate floating point grid. Write get() and
//        set() methods for variables:
//
//        double x
//        double y
//        double z
//
//        Implement constructors to take following
//        parameters:
//
//        ()          // Nothing, initialize coordinates to 0,0,0
//        (x, y)      // set Z to 0
//        (x, y, z)
//
//        In the Program.java::main() method,
//        demonstrate use of the Coordinate class by
//        creating at least two different objects.
//        Change their positions randomly at
//        least once in a grid of size 0..100.
//
//        Coordinate player = new Coordinate();
//        Coordinate enemy = new Coordinate();
//
//        ... randomly move both object to another location



public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate();
        Coordinate enemy = new Coordinate();
        player.setX(22);
        player.setY(33);
        enemy.setX(10);
        enemy.setY(30);
    }

}
