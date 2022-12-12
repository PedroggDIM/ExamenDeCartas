package es.lanyu.cartas;

import java.util.Objects;

public class Carta implements Comparable<Carta>{

	private String palo;
	private int numero;

	public String getPalo() {
		return palo;
	}

	public int getNumero() {
		return numero;
	}

	protected void setPalo(String palo) {
		this.palo = palo;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	public Carta(String palo, int numero) {	
		setPalo(palo);
		setNumero(numero);
	}

	@Override
	public String toString() {
		String string = getNumero() + "";
		if(getNumero() == 1) {
			string = "As";
		}else if(getNumero() == 8){
			string = "Sota";			
		}else if(getNumero() == 9) {
			string = "Caballo";
		}else if(getNumero() == 10) {
			string = "Rey";
		}
		return string + " de " + getPalo();
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return numero == other.numero && Objects.equals(palo, other.palo);
	}

	@Override
	public int compareTo(Carta otraCarta) {
		// ordena por palo y luego por numero ascendente
		// ordeno primero por palo
				int resultado =  getPalo().compareTo(otraCarta.getPalo());		
				// si el palo es el mismo ordeno por número ascendente.
				if(resultado == 0) {
				resultado = Integer.compare(getNumero(),  otraCarta.getNumero());
				}
				return resultado;
			}
	}
	
	
	



