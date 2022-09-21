//2.2 Override - equals
//
//        Improved previous Pen.java class that works with code:
//
//        Pen pen1 = new Pen()
//        pen.setType("led");
//
//        Pen pen2 = new Pen()
//        pen.setType("led");
//
//        // Outputs "pen1 equals pen2"
//
//        if (pen1.equals(pen2)) {
//        System.out.prinln("pen1 equals pen2);
//        }
//



public class Program {
    String type;

    @Override
    public boolean equals(Object obj) {
        Program c = (Program) obj;
        return c.type == this.type;
    }

    public void setType(String type){
        this.type=type;
    }
    public static void main(String[] args) {
        Program program = new Program();
        program.setType("BLUE");
        Program program1 = new Program();
        program1.setType("BLUE");
        if(program.equals(program1)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
