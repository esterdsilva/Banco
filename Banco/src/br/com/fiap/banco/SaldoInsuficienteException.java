package br.com.fiap.banco;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente na conta.");
    }
}
