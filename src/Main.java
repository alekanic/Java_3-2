public class Main {
    public static void main(String[] args) {

        double kilograms = 98;
        double meters = 1.87;
        BmiService service = new BmiService();
        int myBmiService = service.calculate(kilograms,meters);
        System.out.println(myBmiService);

    }
}
