import problema1.wmaPlay;

public class wmaPlayNosso extends wmaPlay implements FormatoAudio {
	private boolean parado;

	@Override
	public void abrir(String string) {
		setFile(string);
		
	}

	@Override
	public void reproduzir() {
		play();
		
	}

	@Override
	public void pausar() {
		parado = true;
		stop();
	}

	@Override
	public void parar() {
		stop();
		setLocation(0);
		
		
	}

	@Override
	public void avancar(int n) {
		setLocation(getLocation() + n); 		
	}

	@Override
	public void retornar(int n) {
		setLocation(getLocation() - n); 
		
	}

	@Override
	public void liberar() {
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
