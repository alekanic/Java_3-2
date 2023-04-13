public class BmiService {
    public int calculate (double kilograms, double meters) {
        double bmi_index = kilograms / (meters * meters);
        return (int) bmi_index;
    }

}
