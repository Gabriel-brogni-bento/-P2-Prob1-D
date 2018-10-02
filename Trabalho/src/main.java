public class main {

	
	
	public static void main(String[] args) {
		String arquivo = "teste.mp4";
		
		FormatoAudio AA = new GerenciadorArquivosFactory().criarArquivo(TipoArquivo.AIFFSuperPlayer, arquivo);
		GerenciadorArquivosFacade GA = new GerenciadorArquivosFacade(AA);
		
		AA.abrir(arquivo);
		AA.reproduzir();
		AA.avancar(10);
		AA.parar();
		AA.reproduzir();
		AA.avancar(10);
		AA.retornar(2);
		AA.liberar();
		GA.reproduzirSimples(arquivo);
		GA.pararSimples();
		
	}

}