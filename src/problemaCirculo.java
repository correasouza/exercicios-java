import java.util.Scanner;
import java.util.Locale;

public class problemaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double pi = 3.14159;

        System.out.print("Digite o valor do raio do circulo: ");
        double raioDoCirculo = input.nextDouble();
        input.close();

        double areaDoCirculo = pi * (Math.pow(raioDoCirculo, 2));

        System.out.printf("AREA = %.3f", areaDoCirculo);
    }
}
