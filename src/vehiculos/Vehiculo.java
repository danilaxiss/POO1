package vehiculos;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int numRuedas;
	private double peso;
	private int velocidad;
	
	
	public boolean frenar() {
		return false;
		
	}
	public boolean acelerar() {
		if(velocidad + 10 > velocidadMaxima) {
			return false;
		}
		velocidad+=10;
		return true;
		
	}
	
	public Vehiculo(int velocidadMaxima, int numRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Vehiculo velocidadMaxima=" + velocidadMaxima + 
				", numRuedas=" + numRuedas + ", peso=" + peso;
	}
	
}
