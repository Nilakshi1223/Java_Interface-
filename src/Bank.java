public interface Bank {
    void deposit();
    void withdraw();
    void loan();
    void account();

}

abstract class employeer implements Bank {

    @Override
    public void deposit() {
        System.out.println("Deposit Amount : " + 1000);
    }
}

abstract class employee extends employeer{
    @Override
    public void withdraw() {
        System.out.println("Withdraw Amount : " + 500);
    }
}

class Labour extends employee {
    @Override
    public void loan() { }

    @Override
    public void account() { }
}

class Test3{
    public static void main(String[] args) {
        Labour l = new Labour(); // employee e = new Labour(); , employeer e = new employee(); , Bank b = new employee();
        l.account();
        l.loan();
        l.deposit();
        l.withdraw();
    }
}