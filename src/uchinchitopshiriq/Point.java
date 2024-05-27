package uchinchitopshiriq;

public class Point {

    private double x;
    private double y;
    private double z;


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {

        Point point = new Point(1.0, 2.0, 3.0);


        System.out.println("x: " + point.getX());
        System.out.println("y: " + point.getY());
        System.out.println("z: " + point.getZ());


        point.setX(4.0);
        point.setY(5.0);
        point.setZ(6.0);


        System.out.println("Yangi x: " + point.getX());
        System.out.println("Yangi y: " + point.getY());
        System.out.println("Yangi z: " + point.getZ());


        System.out.println(point.toString());
    }
}
