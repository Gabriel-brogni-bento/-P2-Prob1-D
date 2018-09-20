
public class main {

	
	
	public static void main(String[] args) {
		String arquivo = "teste.mp4";
		GerenciadorArquivos GA = new GerenciadorArquivos(new AIFFSuperPlayerNosso(arquivo));
		
		GA.abrir(arquivo);
		GA.reproduzir();
		GA.avancar(10);
		GA.parar();
		GA.reproduzir();
		GA.avancar(10);
		GA.retornar(2);
		GA.liberar();
		GA.reproduzirSimples(arquivo);
		GA.pararSimples();
		
		GA = new GerenciadorArquivos(new wmaPlayNosso());
		GA.abrir(arquivo);
		GA.reproduzir();
		GA.avancar(10);
		GA.parar();
		GA.reproduzir();
		GA.avancar(10);
		GA.retornar(2);
		GA.parar();
		GA.liberar();
		GA.reproduzirSimples(arquivo);
		GA.pararSimples();
		
		GA = new GerenciadorArquivos(new WAVPlayerNosso(arquivo));
		GA.abrir(arquivo);
		GA.reproduzir();
		GA.avancar(10);
		GA.parar();
		GA.reproduzir();
		GA.avancar(10);
		GA.retornar(20);
		GA.liberar();
		GA.reproduzirSimples(arquivo);
		GA.pararSimples();
	}

}
