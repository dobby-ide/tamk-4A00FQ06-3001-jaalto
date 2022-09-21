//2.5 Coordinate class - arrays
//
//        Ask N objects (user defined), their names
//        and coordinates from the user. Study
//        java.util.Scanner (older) or java.io.Console
//        (newer[2]) classes how to read input from user.
//
//        - Store the object names to a String class array
//        - Store the object locations to Coordinate class array.
//
//        At the end of program, write a loop to display each
//        object and their location.
//
//        Location of ... at X, Y, Z
//        Location of ... at X, Y, Z
//        Location of ... at X, Y, Z
//        Location of ... at X, Y, Z
//        Location of ... at X, Y, Z


import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many objects do you want to create?");
        int num = Integer.parseInt(scan.nextLine());
        String[] names = new String[num];
        Coordinate array []= new Coordinate[num];
        for(int i = 0; i < num;i++){
            System.out.println("name of object number " + (i+1) + ": ");

            String name = scan.nextLine();
            names[i] = name;
            System.out.println("enter x coordinate for " + name);
            double x = Integer.parseInt(scan.nextLine());
            System.out.println("enter y coordinate for " + name);
            double y = Integer.parseInt(scan.nextLine());
            System.out.println("enter z coordinate for " + name);
            double z = Integer.parseInt(scan.nextLine());
            array[i]= new Coordinate(x,y,z);
        }

        for(int i = 0;i<names.length;i++){
            String t = names[i];
            Coordinate j = new Coordinate(array[i].getX(), array[i].getY(),array[i].getZ());
            System.out.print("location of " + t + " at ");
            System.out.println(j);

        }
    }
}
