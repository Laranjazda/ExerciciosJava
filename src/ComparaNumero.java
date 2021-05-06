import java.util.Scanner;

public class ComparaNumero {
    public void recebeECompara(){
        int numA;
        int numB;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número qualquer:");
        numA = entrada.nextInt();
        System.out.println("Agora digita um segundo número qualquer:");
        numB = entrada.nextInt();

        if (numA == numB){
            System.out.println("os dois números são iguais");
        } else {
            System.out.println("Os dois números não são iguais");
        }

        if (numA > numB) {
            System.out.println("Maior : " + numA);
            System.out.println("Menor: " + numB);
        } else {
            System.out.println("Maior : " + numB);
            System.out.println("Menor: " + numA);
        }



    }
}
