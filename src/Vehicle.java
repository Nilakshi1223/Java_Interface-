public interface Vehicle {
    abstract void drive();
}

interface Car{
    abstract void modernDrive();
}
class Audi implements Vehicle, Car{
    @Override
    public void drive() {
        System.out.println("Driving!");
    }

    @Override
    public void modernDrive() {
        System.out.println("Modern Driving");
    }
}

class Test2{
    public static void main(String[] args) {
        Audi a = new Audi(); // Vehicle v = new Audi;
        a.drive();
        a.modernDrive();
    }
}
