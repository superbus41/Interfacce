package esercitazioneInterfacce;

public class DistributoreDiBenzina implements Comparable {
	
	private String città, proprietario;
	private float capacità, benzinaAttuale;
	
	
	public DistributoreDiBenzina(String città, String proprietario, float capacità, float benzinaAttuale) {
		super();
		this.città = città;
		this.proprietario = proprietario;
		this.capacità = capacità;
		this.benzinaAttuale = benzinaAttuale;
	}

	
	public int compareTo(DistributoreDiBenzina d) {

		return 0;
	}
	
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof DistributoreDiBenzina) {
			DistributoreDiBenzina d = (DistributoreDiBenzina)o;
			if (this.capacità < d.capacità)
				return -1;
			if (this.capacità > d.capacità)
				return 1;
			}
		return 0;
	}
	
	public float ErogazioneCarburante(float l) {
		benzinaAttuale -= l;
		return l * 1.4f;
	}
	
}
