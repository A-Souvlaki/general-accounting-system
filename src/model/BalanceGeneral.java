package model;

import java.util.ArrayList;

public class BalanceGeneral {

	private ArrayList<Cuenta> activos;

	private ArrayList<Cuenta> pasivos;

	private Cuenta capital;

	private Cuenta reserva;

	private Cuenta utilidad;
	
	public BalanceGeneral() {
		
		activos = new ArrayList<Cuenta>();
		pasivos = new ArrayList<Cuenta>();
		this.capital = null;
		this.reserva = null;
		this.utilidad = null;
	}
	



	

}
