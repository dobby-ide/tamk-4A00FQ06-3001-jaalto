public class Program {
    public void movement(int input){
        for (int i = 0; i<input;i++){
            System.out.print((" ".repeat(input)));
            System.out.println("*");
            if(i==input-1){
                System.out.print("*".repeat(input));
            }
        }
    }
    public static void main(String[] args) {
        Program shapeL=new Program();
        shapeL.movement(5);
    }
}
