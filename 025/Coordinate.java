public class Coordinate {
    double x;
    double y;
    double z;
    public void origo(){
        x=0;
        y=0;
        z=0;
    }
    public void up(double number){
        if(number>=0 && number <=100){
        if(this.y + number>=0 && this.y + number <=100) {
            this.y += number;
        }
            else{
                this.y=100;
            }
        }
    else{
            System.out.println("please enter a number between 0-100");
        }
    }

    public void down(double number){
        if(number>=0 && number <=100){
            if(this.y - number>=0 && this.y - number <=100){

            this.y -= number;
        }
        else{
            this.y=0;
        }
        }else{
            System.out.println("please enter a number between 0-100");
        }
    }
    public void right(double number){
        if(number>=0 && number <=100){
            if(this.x + number>=0 && this.x + number <=100) {
                this.x += number;
            }
            else{
                this.x=100;
            }
        }
        else{
            System.out.println("please enter a number between 0-100");
        }
    }
    public void left(double number){
        if(number>=0 && number <=100){
            if(this.x - number>=0 && this.x - number <=100) {
                this.x -= number;
            }
            else{
                this.x=0;
            }
        }
        else{
            System.out.println("please enter a number between 0-100");
        }
    }
    public Coordinate(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public Coordinate(double x, double y){
        this.x=x;
        this.y=y;
        this.z=0;
    }
    public Coordinate(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
