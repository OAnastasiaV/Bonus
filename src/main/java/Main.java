public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = (int) service.calculate(5000,true);
        System.out.println(bonus);

    }
}
