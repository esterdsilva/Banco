package br.com.fiap.banco;

@SuppressWarnings("serial")
public class TitularidadeDiferenteException extends Exception {
    public TitularidadeDiferenteException() {
        super("Transferência não permitida para contas com titularidades diferentes.");
    }
}
