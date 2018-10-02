
public class GerenciadorArquivosFacade {
	private FormatoAudio formato;
	
	public GerenciadorArquivosFacade(FormatoAudio formato) {
		this.formato = formato;
	}

	public void reproduzirSimples(String file) {
		formato.abrir(file);
		formato.reproduzir();
	}
	
	public void pararSimples() {
		formato.parar();
		formato.liberar();
	}

}
