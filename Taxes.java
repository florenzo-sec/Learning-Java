import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        System.out.println("The income brackets and their tax rates are:");
        System.out.println("0 - 10,000: exempt");
        System.out.println("10,000 - 20,000: 12%");
        System.out.println("20,000 - 35,000: 18%");
        System.out.println("35,000 - 60,000: 27%");
        System.out.println("60,000 - 100,000: 48%");
        System.out.println("over 100,000: 60%");

        Scanner input = new Scanner(System.in);

        float income, tax;

        System.out.println("Income: ");
        income = input.nextFloat();

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = income / 100 * 12;
        } else if (income <= 35000) {
            tax = income / 100 * 18;
        } else if (income <= 60000) {
            tax = income / 100 * 27;
        } else if (income <= 100000) {
            tax = income / 100 * 48;
        } else {
            tax = income / 100 * 60;
        }

        System.out.println("Tax: " + tax);
    }
}