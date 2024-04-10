public class Quiz {
    float salary=40000;
}
class  Pr extends Quiz{
    int bonus=10000;

    public static void main(String[] args) {
        Pr p=new Pr();
        System.out.println("Salary:-"+p.salary);
        System.out.println("Bonus:-"+p.bonus);
    }
}
