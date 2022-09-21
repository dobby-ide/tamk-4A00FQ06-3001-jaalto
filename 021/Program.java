//2.1 Override - toString
//
//        Implement Pen.java class so that it works with code:
//
//        Pen pen = new Pen()
//        pen.setType("led");
//
//        // Outputs "led"
//        System.out.println(pen);

public class Program {
    String type;
    @Override
    public String toString() {
        return type;
    }

    public void setType(String type){
        this.type=type;
    }
    public static void main(String[] args) {
        Program program = new Program();
        program.setType("BLUE");
        System.out.println(program);
    }
}
