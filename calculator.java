import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double principal;
        Double rate;
        int timescompounded;
        int years;
        Double amount;
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Ente the rate per interest: ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the timescompounded:");
        timescompounded = scanner.nextInt();
        System.out.print("Enter the years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timescompounded, timescompounded * years);
        System.out.printf("The amount after %d years is %.2f\n",years,amount);
        scanner.close();


    }
}
    

