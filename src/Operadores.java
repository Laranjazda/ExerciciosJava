public class Operadores {
    public static void main(String[] args) {
        boolean contratado = false;
        int quantidadeAnos = 2;
        int horasTrabalhadas = 40;
        int valorHora = 50;
        int salario = 0;
        int calculoHoras = valorHora * horasTrabalhadas;


        if (contratado != true){
            System.out.println(
                    "#######################\n" +
                    "Você não é funcionário.\n" +
                    "#######################\n");
        }
        else {
            if (quantidadeAnos <= 1){
                salario = 1500;
            }else if ((quantidadeAnos > 1) && (quantidadeAnos < 3)){
                salario = 2000;
            }else {
                salario = 3000;
            }
            int salarioBruto = salario + calculoHoras;
            System.out.println(
                    "################################################################## \n" +
                    "Você fez R$:" + calculoHoras + ",00 em horas extras esse mês.\n" +
                    "Seu salário base é de R$:" + salario + ",00 \n" +
                    "Seu salário bruto esse mês é de: R$:" + salarioBruto + ",00. \n" +
                    "##################################################################");
        }
    }
}
