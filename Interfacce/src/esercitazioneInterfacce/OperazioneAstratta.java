package esercitazioneInterfacce;

public abstract class OperazioneAstratta implements Operazione {
	
	protected float result;

	@Override
	public abstract void apply(float a, float b);

	@Override
	public void stampaVideo() {
		System.out.println(result);
	}

}
