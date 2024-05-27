package Birinchitopshiriq;

public class Car {
    private String rangi;
    private String modeli;
    private double narxi;
    private boolean isavtomat;

    public Car(String rangi, String modeli, double narxi, boolean isavtomat) {
        this.rangi = rangi;
        this.modeli = modeli;
        this.narxi = narxi;
        this.isavtomat = isavtomat;
    }


    public void informatsiya() {
        System.out.println("Car{" +
                "rangi='" + rangi + '\'' +
                ", modeli='" + modeli + '\'' +
                ", narxi=" + narxi +
                ", isavtomat=" + isavtomat +
                '}');
    }

    public static void main(String[] args) {
        Car car = new Car("qizil","nexia",120000000,true);
        car.informatsiya();
    }
}
