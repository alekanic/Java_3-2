public class BmiService {
    public int calculate (double kilograms, double meters) {
        double bmiIndex = kilograms / (meters * meters);
        return (int) bmiIndex;
    }

}
