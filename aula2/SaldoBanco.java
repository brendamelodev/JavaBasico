package aula2;

import java.util.Random;

public class SaldoBanco {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int saldoInicial = 10000;
        double credito = 0;
        double debito = 0;

        for (int i = 0; i <= 12; i++) {
            double tran = aleatorio.nextInt(-2500, 2500);
            saldoInicial += tran;
            if (tran > 0) {
                credito += tran;
                System.out.println("Foi adicionado " +tran+ " da sua conta. Seu saldo atual e: " +saldoInicial);
            }
            if (tran < 0) {
                debito += tran;
                System.out.println("Foi retirado " +tran+ " da sua conta. Seu saldo atual e: " +saldoInicial);
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("credito = " +credito);
        System.out.println("debito = " +debito);
        System.out.println("Saldo final = " +saldoInicial);
        // sout
    }
}
