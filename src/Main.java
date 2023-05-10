// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Double percent = 9.99;
        int sumCredit = 1000000;
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесечный платёж за 1 год: " + service.calculate(1, sumCredit, percent));
        System.out.println("Ежемесечный платёж за 2 год: " + service.calculate(2, sumCredit, percent));
        System.out.println("Ежемесечный платёж за 3 год: " + service.calculate(3, sumCredit, percent));

    }
}