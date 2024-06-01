public class BmiService {
    public int calculate(int weight, double height) {
        int result = (int) (weight / Math.pow(height, 2));
        return result;
    }
}
