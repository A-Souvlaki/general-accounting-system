package model;

public class AdministradorCuentas {
	
	private BalanceGeneral bg;
	
	private EstadoDeResultados er;
	
	
	public AdministradorCuentas() {
		bg = new BalanceGeneral();
		er = new EstadoDeResultados();
	}


	public BalanceGeneral getBg() {
		return bg;
	}


	public EstadoDeResultados getEr() {
		return er;
	}

	
	

}
