import java.util.Scanner;
import java.util.Locale;

public class problemaTerreno{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double larguraDoTerreno = input.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimentoDoTerreno = input.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double valorDoMetroQuadrado = input.nextDouble();
        input.close();

        double areaDoTerreno = larguraDoTerreno * comprimentoDoTerreno;
        double precoDoTerreno = areaDoTerreno * valorDoMetroQuadrado;

        System.out.printf("Area do terreno = %.2f %n", areaDoTerreno);
        System.out.printf("Preço do terreno = %.2f %n", precoDoTerreno);


    }
}