package es.rodal.principal;

import java.util.ArrayList;

import es.rodal.animal.Animal;
import es.rodal.animal.Aranha;
import es.rodal.animal.Gato;
import es.rodal.animal.Mascota;
import es.rodal.animal.Pez;

public class Principal {
	public static void main(String[] args) {

		Animal pez = new Pez();
		Animal gato = new Gato();
		Animal aranha = new Aranha();
		
		ArrayList<Animal> animales = new ArrayList<>();
		
		animales.add(pez);
		animales.add(gato);
		animales.add(aranha);
		
		for (Animal animal : animales) {
			animal.andar();
			animal.comer();
			if (animal instanceof Mascota) {
				((Mascota)animal).jugar();
			}
		}
	}
}
