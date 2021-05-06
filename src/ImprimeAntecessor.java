import java.util.Scanner;
public class ImprimeAntecessor {
    public void recebeNumero(){
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = entrada.nextInt();
        int antecessor = numero -1;
        int sucessor = numero +1;
        System.out.println("Você digitou: " + numero +
                "\nSeu antecessor é: " + antecessor +
                "\nSeu sucessor é: " + sucessor);

    }
}
