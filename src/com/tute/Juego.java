package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.GrupoCartas;

public class Juego {
	
	public static void main(String[] args) {
      
		String [] palos = {"OROS","COPAS","ESPADAS","BASTOS"};
        Baraja baraja = new Baraja();
        
        for (int i = 0; i < palos.length; i++) {
			for (int j = 1; j <= 10; j++) {
				baraja.getCartas().add(new Carta(palos[i], j));
				
			}
		}
        baraja.getCartas().forEach(System.out::println);
        baraja.barajar();
        System.out.println("---Después de barajar---------");
        baraja.getCartas().forEach(System.out::println);
        
        System.out.println("---Robo una carta-------------");
         // Creo una carta que sea la penúltima.
        int numeroMaximo =10;
		Carta cartaParaBusCar = new Carta(palos[palos.length-1], numeroMaximo  -1);
		System.out.println("Busco " + cartaParaBusCar);
		// hay que hacerse el equals y hashcode en Carta para que funcione
		System.out.println("Robo carta y se quita de la baraja: "+ baraja.robar(cartaParaBusCar));
		//System.out.println("Robo carta "+ baraja.robar(null));
		
        baraja.getCartas().forEach(System.out::println);
        System.out.println("----------------------------------------");
        
        System.out.println("----Ordeno las cartas(orden NATURAL) por palos y numero ascendente y las imprimo-----");
        baraja.getCartas().sort(null);
        baraja.getCartas().forEach(System.out::println);
        
		
	}

}
