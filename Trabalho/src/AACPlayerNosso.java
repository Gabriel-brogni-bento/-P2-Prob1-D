import problema1.AACPlayer;

public class AACPlayerNosso extends AACPlayer implements FormatoAudio {

	public AACPlayerNosso(String file) {
		super(file);
	}

	@Override
	public void abrir(String string) {
		open();
		setLocation(0);
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
		stop();		
	}

	@Override
	public void avancar(int valor) {
		setLocation(getLocation() + valor);
	}

	@Override
	public void retornar(int valor) {
		setLocation(getLocation() + valor);		
	}

	@Override
	public void liberar() {}
}
