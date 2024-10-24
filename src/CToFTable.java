public class CToFTable{
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("--------------------");
        for (int c = -100; c <= 100; c++) {
            System.out.printf("%-10d %-10.2f\n", c, CtoF(c));
        }
    }

    public static double CtoF(double celsius) {
        return (celsius * 9 / 5)+32;
}
}