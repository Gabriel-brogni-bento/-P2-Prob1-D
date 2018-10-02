
public class GerenciadorArquivosFactory {

	public FormatoAudio criarArquivo(TipoArquivo tipo, String nome) {
		switch (tipo) {
		case AIFFSuperPlayer:
			return new AIFFSuperPlayerNosso(nome);
		case WAVPlayer:
			return new WAVPlayerNosso(nome);
		case wmaPlay:
			return new wmaPlayNosso();
		case AACPLayer:
			return new AACPlayerNosso(nome);
		case MP3DJ:
			return new MP3DJNosso();
		}
		
		return null; // ou exceção..
	}
	
}
