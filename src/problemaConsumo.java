import java.util.Scanner;
import java.util.Locale;

public class problemaConsumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distanciaPercorrida = input.nextInt();
        System.out.print("Combustível gasto: ");
        double combustivelGasto = input.nextDouble();
        input.close();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("Consumo medio = %.3f", consumoMedio);

    }
}
