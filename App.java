import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da temperatura em Fahrenheit: ");
        double temperatura = scanner.nextDouble();
        scanner.close();

        double celsius = (temperatura - 32) / 1.8;

        System.out.print("O valor convertido de Fahrenheit para Celsius será: " + celsius);

    }
}