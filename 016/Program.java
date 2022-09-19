
public class Program {

    public void printingTable(int m, int n){
        for(int i = 1; i <=m;i++){
            for(int j = 1;j<=n; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Program program = new Program();
        program.printingTable(6,7);
    }

}
