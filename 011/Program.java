
public class Program{

  public void movingDownRight(int input){

    for(int i=0; i<input; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
 }
      System.out.println("*");
  };
  }

    public static void main (String[] args){
        Program line = new Program();
        line.movingDownRight(4);
      }
}
