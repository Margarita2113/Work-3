public class CreditPaymentService {


    public int calculate(int year, int sum, Double percent) {

        Double percDol = percent / (100 * 12);

        return (int) (sum * (percDol + (percDol / (Math.pow(1 + percDol, year * 12) - 1))));
    }
}

