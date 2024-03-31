import java.util.Scanner;
import java.util.Locale;

public class problemaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double baseDoRetangulo = input.nextDouble();
        System.out.print("Altura do retangulo: ");
        double alturaDoRetangulo = input.nextDouble();
        input.close();

        double areaDoRetangulo = baseDoRetangulo * alturaDoRetangulo;
        double perimetroDoRetangulo = (baseDoRetangulo * 2) + (alturaDoRetangulo * 2);
        double diagonalDoRetangulo = (Math.sqrt((baseDoRetangulo * baseDoRetangulo) + (alturaDoRetangulo * alturaDoRetangulo)));

        System.out.printf("AREA = %.4f %n", areaDoRetangulo);
        System.out.printf("PERIMETRO = %.4f %n", perimetroDoRetangulo);
        System.out.printf("DIAGONAL = %.4f", diagonalDoRetangulo);

    }
}
