public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double oneYearOneBilNinePercent = service.calculate(1_000_000,9.99,12);
        String monthPay0 = String.format("%.0f",oneYearOneBilNinePercent);
        System.out.println(monthPay0);

        double twoYearOneBilNinePercent = service.calculate(1_000_000,9.99,24);
        String monthPay1 = String.format("%.0f",twoYearOneBilNinePercent);
        System.out.println(monthPay1);

        double threeYearOneBilNinePercent = service.calculate(1_000_000,9.99,36);
        String monthPay2 = String.format("%.0f",threeYearOneBilNinePercent);
        System.out.println(monthPay2);
    }
}
