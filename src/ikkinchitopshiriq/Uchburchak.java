package ikkinchitopshiriq;
public class Uchburchak {
    private double katetA;
    private double katetB;


    public Uchburchak(double katetA, double katetB) {
        this.katetA = katetA;
        this.katetB = katetB;
    }


    public double getKatetA() {
        return katetA;
    }

    public void setKatetA(double katetA) {
        this.katetA = katetA;
    }

    public double getKatetB() {
        return katetB;
    }

    public void setKatetB(double katetB) {
        this.katetB = katetB;
    }


    public double yuzaniHisoblash() {
        return 0.5 * katetA * katetB;
    }


    public double perimetrniHisoblash() {
        double gipotenuza = Math.sqrt((katetA * katetA) + (katetB * katetB));
        return katetA + katetB + gipotenuza;
    }


    public double yuzaniHisoblash(int katetA, int katetB) {
        return 0.5 * katetA * katetB;
    }

    public double yuzaniHisoblash(float katetA, float katetB) {
        return 0.5 * katetA * katetB;
    }

    public double yuzaniHisoblash(long katetA, long katetB) {
        return 0.5 * katetA * katetB;
    }

    public double yuzaniHisoblash(double katetA, double katetB) {
        return 0.5 * katetA * katetB;
    }

    public double perimetrniHisoblash(int katetA, int katetB) {
        double gipotenuza = Math.sqrt((katetA * katetA) + (katetB * katetB));
        return katetA + katetB + gipotenuza;
    }

    public double perimetrniHisoblash(float katetA, float katetB) {
        double gipotenuza = Math.sqrt((katetA * katetA) + (katetB * katetB));
        return katetA + katetB + gipotenuza;
    }

    public double perimetrniHisoblash(long katetA, long katetB) {
        double gipotenuza = Math.sqrt((katetA * katetA) + (katetB * katetB));
        return katetA + katetB + gipotenuza;
    }

    public double perimetrniHisoblash(double katetA, double katetB) {
        double gipotenuza = Math.sqrt((katetA * katetA) + (katetB * katetB));
        return katetA + katetB + gipotenuza;
    }

    public static void main(String[] args) {

        Uchburchak uchburchak = new Uchburchak(3.0, 4.0);


        System.out.println("Yuza: " + uchburchak.yuzaniHisoblash());
        System.out.println("Perimetr: " + uchburchak.perimetrniHisoblash());


        System.out.println("Yuza (int): " + uchburchak.yuzaniHisoblash(3, 4));
        System.out.println("Perimetr (int): " + uchburchak.perimetrniHisoblash(3, 4));
        System.out.println("Yuza (float): " + uchburchak.yuzaniHisoblash(3.0f, 4.0f));
        System.out.println("Perimetr (float): " + uchburchak.perimetrniHisoblash(3.0f, 4.0f));
        System.out.println("Yuza (long): " + uchburchak.yuzaniHisoblash(3L, 4L));
        System.out.println("Perimetr (long): " + uchburchak.perimetrniHisoblash(3L, 4L));
        System.out.println("Yuza (double): " + uchburchak.yuzaniHisoblash(3.0, 4.0));
        System.out.println("Perimetr (double): " + uchburchak.perimetrniHisoblash(3.0, 4.0));
    }
}
