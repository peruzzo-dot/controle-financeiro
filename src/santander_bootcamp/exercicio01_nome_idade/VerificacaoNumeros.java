package santander_bootcamp.exercicio01_nome_idade;

import java.util.Scanner;

public class VerificacaoNumeros {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var number = scanner.nextInt();
        var keepVerify = true;

        while (keepVerify) {
            System.out.println("Informe o número para verificação");
            var toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }
            break;
        }
    }
}