import problema1.AIFFSuperPlayer;

public class AIFFSuperPlayerNosso extends AIFFSuperPlayer implements FormatoAudio {

	public AIFFSuperPlayerNosso(String file) {
		super(file);
		setCursor(0);
	}

	@Override
	public void abrir(String string) {
	}

	@Override
	public void reproduzir() {
		play();
	}

	@Override
	public void pausar() {
		pause();
	}

	@Override
	public void parar() {
		stop();
		setCursor(0);
	}

	@Override
	public void avancar(int valor) {
		int posicao = pause();
		setCursor(posicao + valor);
		play();
	}

	@Override
	public void retornar(int valor) {
		int posAtual = pause();
		setCursor(posAtual - valor);
		play();
	}

	@Override
	public void liberar() {
		release();
	}

}