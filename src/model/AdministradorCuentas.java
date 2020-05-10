package model;

import java.util.ArrayList;

public class AdministradorCuentas {
	
	public final static String ACORRIENTE = "Activo Corriente";
	public final static String ANO_CORRIENTE = "Activo No corriente";
	public final static String PCORRIENTE = "Pasivo Corriente";
	public final static String PNO_CORRIENTE = "Pasivo No corriente";
	public final static String PATRIMONIO ="Patrimonio";
	public final static String GASTO = "Gasto";
	public final static String INGRESO = "Ingreso";
	public final static String COSTO = "Costo de Ventas";
	
	
	private BalanceGeneral bg;
	
	private EstadoDeResultados er;
	
	private ArrayList<Cuenta> cuentas;
	
	
	public AdministradorCuentas() {
		bg = new BalanceGeneral();
		er = new EstadoDeResultados();
		cuentas = new ArrayList<Cuenta>();
		
	}

	public BalanceGeneral getBg() {
		return bg;
	}


	public EstadoDeResultados getEr() {
		return er;
	}
	
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	
	public void añadirActivosCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(ACORRIENTE));
				bg.getActivosCorrientes().add(cuentas.get(i));
		}
	}
	
	public void añadirActivosNoCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(ANO_CORRIENTE));
				bg.getActivosNoCorrientes().add(cuentas.get(i));
		}
	}
	
	public void añadirPasivosCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(PCORRIENTE));
				bg.getPasivosCorrientes().add(cuentas.get(i));
		}
	}
	
	public void añadirPasivosNoCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(PNO_CORRIENTE));
				bg.getPasivosNoCorrientes().add(cuentas.get(i));
		}
	}
	
	public void actualizar() {
		añadirActivosCorrientes();
		añadirActivosNoCorrientes();
		añadirPasivosCorrientes();
		añadirPasivosNoCorrientes();
	}

	
	

}
