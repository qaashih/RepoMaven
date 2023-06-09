public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long actual = service.calculate(1000,true);
        System.out.println(actual);

        actual = service.calculate(1_000_000, true);
        System.out.println(actual);
    }
}
