public class Saldo {
    public void verificaSaldo(){
        int saldo = 20;
        int saque = 10;
        int saldoRestante = (saldo-saque);

        if (saque > saldo){
            System.out.println("saldo insuficiente");
        } else {
            System.out.println("Seu saldo era de " + saldo + ",00");
            System.out.println("você sacou " + saque + ",00 e ficou com um saldo de " + saldoRestante + ",00" );
        }

    }
}
