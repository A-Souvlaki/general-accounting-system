package model;

import java.util.ArrayList;

public class BalanceGeneral {

	private ArrayList<Cuenta> activosCorrientes;

	private ArrayList<Cuenta> pasivosCorrientes;

	private ArrayList<Cuenta> activosNoCorrientes;

	private ArrayList<Cuenta> pasivosNoCorrientes;

	private ArrayList<Cuenta> cuentasPatrimonio;


	public BalanceGeneral() {

		activosCorrientes = new ArrayList<Cuenta>();
		pasivosCorrientes = new ArrayList<Cuenta>();
		activosNoCorrientes = new ArrayList<Cuenta>();
		pasivosNoCorrientes = new ArrayList<Cuenta>();
		cuentasPatrimonio = new ArrayList<Cuenta>();

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
	
	public Cuenta buscarActivosC(int codigo, int valor) {
		Cuenta cuenta = null; 
		boolean close = true;
		for (int i = 0; i < activosCorrientes.size()&&close; i++) {
			if (activosCorrientes.get(i).getCodigo_c() == codigo) {
				int oldValue = activosCorrientes.get(i).getValor_c();
				int newValue = oldValue + valor;
				activosCorrientes.get(i).setValor_c(newValue);
				close = false;
			}
		}
		return cuenta;
	}
	
	public Cuenta buscarActivosNC(int codigo,int valor) {
		Cuenta cuenta = null; 
		boolean close = true;
		for (int i = 0; i < activosNoCorrientes.size()&&close; i++) {
			if (activosNoCorrientes.get(i).getCodigo_c() == codigo) {
				int oldValue = activosNoCorrientes.get(i).getValor_c();
				int newValue = oldValue + valor;
				activosNoCorrientes.get(i).setValor_c(newValue);
				close = false;
			}
		}
		return cuenta;
	}
	
	public Cuenta buscarPasivosC(int codigo,int valor) {
		Cuenta cuenta = null; 
		boolean close = true;
		for (int i = 0; i < pasivosCorrientes.size()&&close; i++) {
			if (pasivosCorrientes.get(i).getCodigo_c() == codigo) {
				int oldValue = pasivosCorrientes.get(i).getValor_c();
				int newValue = oldValue + valor;
				pasivosCorrientes.get(i).setValor_c(newValue);
				close = false;
			}
		}
		return cuenta;
	}
	
	public Cuenta buscarPasivosNC(int codigo,int valor) {
		Cuenta cuenta = null; 
		boolean close = true;
		for (int i = 0; i < pasivosNoCorrientes.size()&&close; i++) {
			if (pasivosNoCorrientes.get(i).getCodigo_c() == codigo) {
				int oldValue = pasivosNoCorrientes.get(i).getValor_c();
				int newValue = oldValue + valor;
				pasivosNoCorrientes.get(i).setValor_c(newValue);
				close = false;
			}
		}
		return cuenta;
	}

}
