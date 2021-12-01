public class CreditPaymentService {
    //для расчета ежемесечного аннуитетного платежа

    public double calculate (long credit, double percent, int months) {

            double monthPercent = percent / months / 100;
            double bracket = Math.pow((1+monthPercent), months);

            double annuityRatio = (monthPercent * bracket) / (bracket - 1);

            double monthPay = annuityRatio * credit;

            return monthPay;
    }
}
