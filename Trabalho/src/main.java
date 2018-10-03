public class main {

	
	
	public static void main(String[] args) {
		String arquivo = "teste.mp4";
		
		FormatoAudio AA = new GerenciadorArquivosFactory().criarArquivo(TipoArquivo.MP3DJ, arquivo);
		GerenciadorArquivosFacade GA = new GerenciadorArquivosFacade(AA);
		
		AA.abrir(arquivo);
		AA.reproduzir();
		AA.avancar(10);
		AA.parar();
		AA.reproduzir();
		AA.avancar(10);
		AA.retornar(2);
		AA.liberar();
		AA.pausar();
		AA.reproduzir();
		GA.reproduzirSimples(arquivo);
		GA.pararSimples();
		
	}

}