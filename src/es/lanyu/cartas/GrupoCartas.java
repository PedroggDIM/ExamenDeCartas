package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrupoCartas {

	private List<Carta> cartas = new ArrayList<Carta>();

	public GrupoCartas() {
		super();
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void barajar() {
	 // Collections.shuffle(getCartas());
		Random random = new Random();
		for (int i = 0; i < getCartas().size(); i++) {
			// en aux guardo la carta posicion 0 , 1 , 2, 3 ..
			Carta aux = getCartas().get(i);
			// en auxInt guardo cartas aleatorias de 0 a 10 ( ejempl 2, 9, 7 , 8...)
			int auxInt = random.nextInt(getCartas().size());
			//  set guarda el elemento aux en la posición auxInt.
			aux = getCartas().set(auxInt, aux);
			// establezco el valor de aux en la posición i que vale (0, 1, 2 ...)
			getCartas().set(i, aux);				
		}	
	}
	
	public Carta robar(Carta  cartaBuscada) {
		Carta encontrada = null;
		 //  si es null me devuelve la primera
		if(cartaBuscada == null && getCartas().size() > 0) {
			encontrada = getCartas().get(0);
		}else {
			for (Carta carta : getCartas()) {
			if(carta.equals(cartaBuscada)) {
				encontrada = carta;
				// la tengo que quitar
				
				break;  // al encontrarla me salgo del bucle.
			}
	     }
	    getCartas().remove(encontrada);		
		}
		return encontrada;				
	}
	
	public boolean contiene(Carta  buscada) {
		return getCartas().contains(buscada);		
	}

}