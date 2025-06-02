import java.util.Scanner;
public class Weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double weight;
        double newweight;
        System.out.println("Welcome to the weight conversion program");
        System.out.println("option 1: enter the weight in lbs: ");
        System.out.println("option 2: enter the weight in kgs: ");
        System.out.print("Enter the option: ");
        option = scanner.nextInt();
        if(option == 1)
        {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n",newweight);
        }
        else if (option == 2)
        {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n",newweight);
        }
        else
        {
            System.out.print("The option isn't valid anymore");
        }
        scanner.close();

    }
}
