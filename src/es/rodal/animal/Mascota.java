package es.rodal.animal;

public abstract class Mascota extends Animal {
	
	protected String nombre;
	
	public void jugar() {
		if (this instanceof Gato) {
			System.out.println("A "+ this.nombre + " le gusta jugar con las pelotas");
		} else if (this instanceof Pez) {
			System.out.println("estoy nadando");
		}
	}
}
