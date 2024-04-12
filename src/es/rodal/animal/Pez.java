package es.rodal.animal;

public class Pez extends Mascota{

	@Override
	public void andar() {
		super.andar();
		System.out.println("En realidad no ando, nado");
	}
}
