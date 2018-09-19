import problema1.wmaPlay;

public class wmaPlayNosso extends wmaPlay implements FormatoAudio {

	@Override
	public void abrir(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		stop();
	}

	@Override
	public void parar() {
		stop();
		setLocation(0);
		
	}

	@Override
	public void avancar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retomar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
