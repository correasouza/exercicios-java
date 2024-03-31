import java.util.Scanner;
import java.util.Locale;

public class problemaMedidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double medidaA = input.nextDouble();
        System.out.print("Digite a medida B: ");
        double medidaB = input.nextDouble();
        System.out.print("Digite a medida C: ");
        double medidaC = input.nextDouble();
        input.close();

        double areaDoQuadrado = medidaA * medidaA;
        double areaDoTriangulo = (medidaA * medidaB) / 2;
        double areaDoTrapezio = ((medidaA + medidaB) * medidaC) / 2;

        System.out.printf("AREA DO QUADRADO = %.4f %n", areaDoQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f %n", areaDoTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f", areaDoTrapezio);

    }
}
