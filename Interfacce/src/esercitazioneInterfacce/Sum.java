package esercitazioneInterfacce;

public class Sum extends OperazioneAstratta implements Operazione {

	@Override
	public void apply(float a, float b) {
		result = a + b;
		
	}

}
