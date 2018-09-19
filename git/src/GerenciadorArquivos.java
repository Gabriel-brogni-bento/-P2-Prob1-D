
public class GerenciadorArquivos implements FormatoAudio {
	private FormatoAudio formato;
	
	public GerenciadorArquivos(FormatoAudio formato) {
		this.formato = formato;
	}

	@Override
	public void abrir(String string) {
		formato.abrir(string);
		
	}

	@Override
	public void reproduzir() {
		formato.reproduzir();
		
	}

	@Override
	public void pausar() {
		formato.pausar();
		
	}

	@Override
	public void parar() {
		formato.parar();
		
	}

	@Override
	public void avancar(int n) {
		formato.avancar(n);
		
	}

	@Override
	public void retornar(int n) {
		formato.retornar(n);
		
	}

	@Override
	public void liberar() {
		formato.liberar();
		
	}
	
	public static void main(String[] args) {
		GerenciadorArquivos gerenciador = new GerenciadorArquivos(new wmaPlayNosso());
		
		gerenciador.parar();
	}

}
