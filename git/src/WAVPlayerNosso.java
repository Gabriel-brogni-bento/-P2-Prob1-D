import problema1.WAVPlayer;

public class WAVPlayerNosso extends WAVPlayer implements FormatoAudio{

	public WAVPlayerNosso(String file) {
		super(file);
	}
	
	@Override
	public void abrir(String string) {}

	@Override
	public void reproduzir() {
		play();
	}

	@Override
	public void pausar() {
		stop();
	}

	@Override
	public void parar() {
		stop();
		int posAtual = reward(0);
		reward(posAtual);
	}

	@Override
	public void avancar(int valor) {
		forward(valor * 1000);
	}

	@Override
	public void retornar(int valor) {
		reward(valor * 1000);
	}

	@Override
	public void liberar() {
		try {
			finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

}
