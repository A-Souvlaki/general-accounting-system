package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import application.Main;

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
	
	private ArrayList<Cuenta> cuentasPersistentes;
	
	private ArrayList<Cuenta> cuentas;
	
	
	public AdministradorCuentas() {
		bg = new BalanceGeneral();
		er = new EstadoDeResultados();
		cuentas = new ArrayList<Cuenta>();
		cuentasPersistentes = new ArrayList<Cuenta>();
		readCounts();
		
	}
	
	void readCounts() {
		
		File file = new File("files\\Activos.txt");
		if (file.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String linea;
		        while((linea=br.readLine())!=null) {
		        	String[] write = linea.split(",");
		        	Cuenta cuenta = new Cuenta(write[0],Integer.parseInt(write[1]), write[2], Integer.parseInt(write[3]));
		        	cuentasPersistentes.add(cuenta);
					actualizar();
		        }
				br.close();

			} catch (IOException e) {
				e.getStackTrace();
			}
		}
		
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
	
	public ArrayList<Cuenta> getCuentasP() {
		return cuentasPersistentes;
	}
	
	public void añadirActivosCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(ACORRIENTE) == true) {
				bg.getActivosCorrientes().add(cuentas.get(i));
			}
		}
	}
	
	public void añadirActivosNoCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(ANO_CORRIENTE)== true) {
				bg.getActivosNoCorrientes().add(cuentas.get(i));
			}
		}
	}
	
	public void añadirPasivosCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(PCORRIENTE)== true) {
				bg.getPasivosCorrientes().add(cuentas.get(i));
			}
		}
	}
	
	public void añadirPasivosNoCorrientes() {
		for (int i = 0; i < cuentas.size(); i++) {
			if (cuentas.get(i).getEstado_m().equals(PNO_CORRIENTE)== true) {
				bg.getPasivosNoCorrientes().add(cuentas.get(i));
			}
		}
	}
	
	public void actualizar() {
		añadirActivosCorrientes();
		añadirActivosNoCorrientes();
		añadirPasivosCorrientes();
		añadirPasivosNoCorrientes();
	}

	
	

}
