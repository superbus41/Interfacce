package esercitazioneInterfacce;

public class Division extends OperazioneAstratta implements Operazione {

	@Override
	public void apply(float a, float b) {
		result = a / b;
		
	}

}
