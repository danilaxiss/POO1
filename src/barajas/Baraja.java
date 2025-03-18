package barajas;

import java.util.Random;

public class Baraja {
	private Carta[] cartas;
	private Carta[] cartasSacadas;
	
	public Baraja(int numCartasPorPalo, String[] losPalos) {
		cartas = new Carta[numCartasPorPalo * losPalos.length];
		int pos = 0;
		for(int numCarta = 1; numCarta <= numCartasPorPalo; numCarta++) {
			for (String palo : losPalos) {
				cartas[pos++] = new Carta (palo, numCarta);
			}
		}	
	}
	
	public int mostrarCartaAlAzar() {
		Random random = new Random();
		int posicionAleatoria = random.nextInt(0, cartas.length);
		System.out.println(cartas[posicionAleatoria]);
		return posicionAleatoria;
	}
	
	
	public Carta sacarCartaAlAzar() {
		// elijo la carta al aazar
		int posicionASacar = mostrarCartaAlAzar();
		Carta cartaASacar = cartas [posicionASacar];

		// creo los futuros arrays de cartas sacadas y en la baraja
		Carta[] nuevaCartas = new Carta[cartas.length - 1];
		Carta[] nuevaCartasSacadas = new Carta [cartasSacadas.length + 1];

		// la carta elegida la añado al nuevo array

		int indexNuevaCartasSacadas = 0;
		for(int i = 0; i < cartasSacadas.length;i++) {

			nuevaCartasSacadas[i] = cartasSacadas [i];
		}
		nuevaCartasSacadas[nuevaCartasSacadas.length - 1] = cartaASacar ;
		cartasSacadas = nuevaCartasSacadas;

		int indexNuevaCartas = 0;
		for(int i = 0 ; i < cartas.length ; i++ ){
			if(i != posicionASacar) {
				nuevaCartas[indexNuevaCartas++] = cartas[i];
			}
		}
		cartas = nuevaCartas;
		return cartaASacar;
	}
	
	 
	public static void main(String[] args) {
		Baraja esp1 = new Baraja(10,
				new String[] {"Oros", "Copas", "Espadas", "Bastos"});
		String[] misPalos =  {"Oros", "Copas", "Espadas", "Bastos"};
		Baraja esp2 = new Baraja(10, misPalos);
		
		for(int i = 0;i < 10; i++) {
			esp1.mostrarCartaAlAzar();
		}
	}

}
