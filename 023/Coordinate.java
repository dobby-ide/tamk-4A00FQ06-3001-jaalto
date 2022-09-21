public class Coordinate {
    double x;
    double y;
    double z;
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


}
