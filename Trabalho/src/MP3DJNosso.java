import problema1.MP3DJ;

public class MP3DJNosso extends MP3DJ implements FormatoAudio {

	@Override
	public void abrir(String file) {
		setFile(file);
		
	}

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
	}

	@Override
	public void avancar(int valor) {
		forward(valor);		
	}

	@Override
	public void retornar(int valor) {
		reward(valor);		
	}

	@Override
	public void liberar() {}
}
