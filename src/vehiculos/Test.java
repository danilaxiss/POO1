package vehiculos;

public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(150, 4, 1300, "SE2520AX");
		Motocicleta m1 = new Motocicleta(140, 2, 400, "SE2123AX");
		Bicicleta b1 = new Bicicleta(40, 2, 20);
			
		System.out.println(c1);
		System.out.println(m1);
		System.out.println(b1);
		
		c1.abrirPuertas();
		c1.cerrarrPuertas();
		c1.acelerar();
		c1.frenar();
		c1.arrancarMotor();
		c1.pararMotor();
	}

}
