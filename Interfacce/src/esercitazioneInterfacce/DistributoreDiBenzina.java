package esercitazioneInterfacce;

public class DistributoreDiBenzina implements Comparable {
	
	private String citt�, proprietario;
	private float capacit�, benzinaAttuale;
	
	
	public DistributoreDiBenzina(String citt�, String proprietario, float capacit�, float benzinaAttuale) {
		super();
		this.citt� = citt�;
		this.proprietario = proprietario;
		this.capacit� = capacit�;
		this.benzinaAttuale = benzinaAttuale;
	}

	
	public int compareTo(DistributoreDiBenzina d) {

		return 0;
	}
	
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof DistributoreDiBenzina) {
			DistributoreDiBenzina d = (DistributoreDiBenzina)o;
			if (this.capacit� < d.capacit�)
				return -1;
			if (this.capacit� > d.capacit�)
				return 1;
			}
		return 0;
	}
	
	public float ErogazioneCarburante(float l) {
		benzinaAttuale -= l;
		return l * 1.4f;
	}
	
}
