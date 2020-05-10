package model;

import java.util.ArrayList;

public class BalanceGeneral {

	private ArrayList<Cuenta> activosCorrientes;

	private ArrayList<Cuenta> pasivosCorrientes;

	private ArrayList<Cuenta> activosNoCorrientes;

	private ArrayList<Cuenta> pasivosNoCorrientes;

	private ArrayList<Cuenta> cuentasPatrimonio;

	private Cuenta utilidad;

	public BalanceGeneral() {

		activosCorrientes = new ArrayList<Cuenta>();
		pasivosCorrientes = new ArrayList<Cuenta>();
		activosNoCorrientes = new ArrayList<Cuenta>();
		pasivosNoCorrientes = new ArrayList<Cuenta>();
		cuentasPatrimonio = new ArrayList<Cuenta>();

		this.utilidad = null;

	}

	public ArrayList<Cuenta> getActivosCorrientes() {
		return activosCorrientes;
	}

	public ArrayList<Cuenta> getPasivosCorrientes() {
		return pasivosCorrientes;
	}

	public ArrayList<Cuenta> getActivosNoCorrientes() {
		return activosNoCorrientes;
	}

	public ArrayList<Cuenta> getPasivosNoCorrientes() {
		return pasivosNoCorrientes;
	}

	public ArrayList<Cuenta> getCuentasPatrimonio() {
		return cuentasPatrimonio;
	}

	public int sumaActivosCorrientes() {
		int value = 0;
		for (int i = 0; i < activosCorrientes.size(); i++) {
			value += activosCorrientes.get(i).getValor_c();
		}
		return value;

	}
	
	public int sumaActivosNoCorrientes() {
		int value = 0;
		for (int i = 0; i < activosNoCorrientes.size(); i++) {
			value += activosNoCorrientes.get(i).getValor_c();
		}
		return value;

	}
	
	public int sumaPasivosCorrientes() {
		int value = 0;
		for (int i = 0; i < pasivosCorrientes.size(); i++) {
			value += pasivosCorrientes.get(i).getValor_c();
		}
		return value;

	}
	
	public int sumaPasivosNoCorrientes() {
		int value = 0;
		for (int i = 0; i < pasivosNoCorrientes.size(); i++) {
			value += pasivosNoCorrientes.get(i).getValor_c();
		}
		return value;

	}
	
	public int sumaActivos() {
		return sumaActivosCorrientes() + sumaActivosNoCorrientes();
	}
	
	public int sumaPasivos() {
		return sumaPasivosCorrientes() + sumaActivosNoCorrientes();
	}

}
