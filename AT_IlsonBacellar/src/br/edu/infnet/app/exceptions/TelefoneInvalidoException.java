package br.edu.infnet.app.exceptions;

public class TelefoneInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TelefoneInvalidoException(String mensagem) {
		super(mensagem);
	}

}
