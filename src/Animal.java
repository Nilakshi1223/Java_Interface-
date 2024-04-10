public interface Animal {
    abstract void animalSound();
    abstract void sleep();
}

class Cat implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzz!");
    }
}

class Test {
    public static void main(String[] args) {

        Animal c = new Cat ();
        c.animalSound();
        c.sleep();
    }
}
