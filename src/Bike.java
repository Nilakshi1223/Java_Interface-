public interface Bike {
    void changeGear(int a);
    void speedUp(int a);
    void applyBreaks(int a);
}

class Bicycle implements Bike {

    int speed;
    int gear;

    @java.lang.Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @java.lang.Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @java.lang.Override
    public void applyBreaks(int dicrement) {
        speed = speed - dicrement;
    }

    public void print(){
        System.out.println("Speed :  " + speed + " Gear : " + gear);
    }
}

class MoterBike implements Bike {

    int speed;
    int gear;

    @java.lang.Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @java.lang.Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @java.lang.Override
    public void applyBreaks(int dicrement) {
        speed = speed - dicrement;
    }

    public void print(){
        System.out.println("Speed :  " + speed + " Gear : " + gear);
    }

}

class Test4{
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(10);
        b.applyBreaks(5);
        System.out.println("Bicycle present status : ");
        b.print();
        MoterBike mb = new MoterBike();
        mb.changeGear(4);
        mb.speedUp(30);
        mb.applyBreaks(18);
        System.out.println("Moter Bike present status : ");
        mb.print();

    }
}
