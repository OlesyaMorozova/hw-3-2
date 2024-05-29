public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kilogram = 98;
        double meter = 1.87;
        int bmi = service.calculate(kilogram, meter);
        System.out.println(bmi);
    }
}
