package br.com.fiap.banco;

@SuppressWarnings("serial")
public class ValorNegativoException extends Exception {
    


	public ValorNegativoException() {
        super("Não é permitido utilizar valores negativos.");
    }
}
