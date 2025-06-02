import java.util.Scanner;
public class Temperature_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to celcious or farenhiet (C or F): ");
        unit = scanner.next().toUpperCase();
        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        System.out.printf("%.1f%s\n",newtemp,unit);
        scanner.close();
    }
}
