
public class Program {
    public double BMI(double weight, double height){
        return weight/(height*height);
    }
    public static void main(String[] args) {
        Program program = new Program();
        double test = program.BMI(89,1.88);
        double bmi = Math.round(test*100)/100;
        System.out.println(bmi);
    }
}
