import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (InputMismatchException | ParametrosInvalidosException exception) {
            if (exception instanceof InputMismatchException) {
                System.out.println("Ambos os parâmetros devem ser números inteiros");
            }
            if (exception instanceof ParametrosInvalidosException) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) { throw new ParametrosInvalidosException(); }
        int contagem = parametroDois - parametroUm;

        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número " + x);
        }
    }
}