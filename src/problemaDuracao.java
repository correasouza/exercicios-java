import java.util.Scanner;
import java.util.Locale;

public class problemaDuracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int duracao = input.nextInt();
        input.close();

        int duracaoHoras = duracao / 3600;
        int duracaoMinutos = (duracao % 3600) / 60;
        int duracaoSegundos = duracao % 3600 % 60;

        System.out.printf("%d: %d: %d", duracaoHoras, duracaoMinutos, duracaoSegundos);
    }
}
