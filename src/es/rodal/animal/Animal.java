package es.rodal.animal;

public abstract class Animal {
	
	protected int nPatas;
	
	public void andar() {
		System.out.println("Este animal anda sobre " + nPatas + " patas");
	}
	
	public void comer() {
		if (this instanceof Aranha) {
			System.out.println("Las arañas comen mosquitos");
		} else if (this instanceof Gato) {
			System.out.println("A los gatos les gusta comer peces y arañas");
		} else if (this instanceof Pez) {
			System.out.println("Los peces comen plancton");
		}
	}
}
