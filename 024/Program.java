//Implement following methods to the Coordinate class and
//        demonstrate their use in Program.java::main() method.
//
//        // Returns current coordinates as String "X, Y, Z"
//        String toString()
//
//        // resets all coordinates to 0, 0, 0
//        void origo()
//
//        // Movement methods
//        up(double)
//        down(double)
//        left(double)
//        right(double)


public class Program {
    public static void main(String[] args) {
        Coordinate player = new Coordinate(20,30,34);
        Coordinate enemy = new Coordinate(10,15,14);
        System.out.println(player);
        System.out.println(enemy);
        player.origo();
        System.out.println(player);
        enemy.origo();
        System.out.println(enemy);
        enemy.up(33);
        System.out.println(enemy);
        enemy.up(44);
        enemy.down(100);
        enemy.right(33);
        enemy.left(2);
        System.out.println(enemy);
    }
}
