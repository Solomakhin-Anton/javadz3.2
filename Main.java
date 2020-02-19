public class Main {
    public static void main(String[] args) {
        int billkopecks = 10000;
        int refillkopecks = 110000;
        int percent;
        if (refillkopecks > 100000) {
            percent = 1;
            refillkopecks = refillkopecks + refillkopecks * percent / 100;

        }
        int total = billkopecks / 100 + refillkopecks / 100;
        System.out.println(total);
        }
}
