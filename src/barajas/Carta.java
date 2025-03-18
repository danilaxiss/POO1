package barajas;

public class Carta {
	private String palo;
	private int numero;
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return String.format("[%c %d]", numero, palo);
	}
	
	

}
