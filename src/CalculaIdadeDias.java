import java.util.Scanner;

public class CalculaIdadeDias {
    public void recebeIdade(){
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        int diaAtual = 5;
        int mesAtual = 5;
        int anoAtual = 2021;
        //Calendar diaDeHoje = Calendar.getInstance();

        //pergunta idade
        System.out.println("Qual dia você nasceu?");
        dia = entrada.nextInt();
        System.out.println("agora o mês de nascimento");
        mes = entrada.nextInt();
        System.out.println("Agora o ano");
        ano = entrada.nextInt();

        //System.out.println(dia + "/" + mes + "/" + ano);
        int dias = (diaAtual - dia);
        int meses = (mesAtual - mes)*30;
        int anos = ((anoAtual - ano) * 12)*30;

        System.out.println("Você nasceu a exatemente: " + dias + meses + anos + " dias.");

    }
}
