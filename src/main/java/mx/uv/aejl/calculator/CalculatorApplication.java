package mx.uv.aejl.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner in = new Scanner(System.in);

        createMenu();
        int option = in.nextInt();

        double number1, number2;


        switch (option) {
            case 1:System.out.println("Enter the first number");
                number1 = in.nextDouble();
                System.out.println("Enter the second number");
                number2 = in.nextDouble();
                System.out.println(sum(number1, number2));
                break;
            case 2:
                System.out.println("Enter the first number");
                number1 = in.nextDouble();
                System.out.println("Enter the second number");
                number2 = in.nextDouble();
                System.out.println(substraction(number1, number2));
                break;
            case 3:
                System.out.println("Enter the first number");
                number1 = in.nextDouble();
                System.out.println("Enter the second number");
                number2 = in.nextDouble();
                System.out.println(multiplication(number1, number2));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static void createMenu() {
        System.out.println("=== Operaciones básicas ===");
        System.out.println("""
                1) Sum
                2) Substraction
                3) Multiplication""");
    }

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static double substraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }
}
