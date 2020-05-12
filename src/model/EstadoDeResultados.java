package model;

import java.util.ArrayList;
import Exceptions.NotFoundIngresosGastos;

public class EstadoDeResultados {

	private ArrayList<Cuenta> ingresosOperacionales;
	
	private ArrayList<Cuenta> ingresosNoOperacionales;
	
	private ArrayList<Cuenta> gastosOperacionales;
	
	private ArrayList<Cuenta> gastosNoOperacionales;
	
	
	private Cuenta utilidadBruta;
	
	private Cuenta utilidadNeta;
	
	private Cuenta costosDeVentas;
	
	private Cuenta VentasNetas;
	

	public Cuenta getVentasNetas() {
		return VentasNetas;
	}

	public void setVentasNetas(Cuenta ventasNetas) {
		VentasNetas = ventasNetas;
	}

	public ArrayList<Cuenta> getIngresosOperacionales() {
		return ingresosOperacionales;
	}

	public void setIngresosOperacionales(ArrayList<Cuenta> ingresosOperacionales) {
		this.ingresosOperacionales = ingresosOperacionales;
	}

	public ArrayList<Cuenta> getIngresosNoOperacionales() {
		return ingresosNoOperacionales;
	}

	public void setIngresosNoOperacionales(ArrayList<Cuenta> ingresosNoOperacionales) {
		this.ingresosNoOperacionales = ingresosNoOperacionales;
	}

	public ArrayList<Cuenta> getGastosOperacionales() {
		return gastosOperacionales;
	}

	public void setGastosOperacionales(ArrayList<Cuenta> gastosOperacionales) {
		this.gastosOperacionales = gastosOperacionales;
	}

	public ArrayList<Cuenta> getGastosNoOperacionales() {
		return gastosNoOperacionales;
	}

	public void setGastosNoOperacionales(ArrayList<Cuenta> gastosNoOperacionales) {
		this.gastosNoOperacionales = gastosNoOperacionales;
	}

	public Cuenta getUtilidadBruta() {
		return utilidadBruta;
	}

	public void setUtilidadBruta(Cuenta utilidadBruta) {
		this.utilidadBruta = utilidadBruta;
	}

	public Cuenta getUtilidadNeta() {
		return utilidadNeta;
	}

	public void setUtilidadNeta(Cuenta utilidadNeta) {
		this.utilidadNeta = utilidadNeta;
	}

	public Cuenta getCostosDeVentas() {
		return costosDeVentas;
	}

	public void setCostosDeVentas(Cuenta costosDeVentas) {
		this.costosDeVentas = costosDeVentas;
	}
	
	public void setCostoDeVenta(Cuenta costosDeVentas){
		
		setCostosDeVentas(costosDeVentas);
		
	}

	public Cuenta utilidadBruta() throws NotFoundIngresosGastos {
		
		Cuenta objeto = null;
		
		if((ingresosOperacionales.isEmpty() && ingresosNoOperacionales.isEmpty() && gastosOperacionales.isEmpty()) && (getCostosDeVentas() == null )) {
			
			throw new NotFoundIngresosGastos("");
			
		}else {
		int m = 0;
		int resultados = 0;
		int m2 = 0;
		
		for(int i = 0; i < ingresosOperacionales.size();i++) {
			m += ingresosOperacionales.get(i).getValor_c();
		}
		
		for(int o = 0; o < ingresosNoOperacionales.size();o++) {
			m += ingresosNoOperacionales.get(o).getValor_c();
		}
		
		for(int u = 0; u < gastosOperacionales.size();u++) {
			m2 += gastosOperacionales.get(u).getValor_c();
		}
		
		int m1 = getCostosDeVentas().getValor_c();
		
		resultados = (m - m1)-m2;
		
		objeto = new Cuenta("Utilidad Bruta",3705,AdministradorCuentas.UTILIDAD,resultados);
		
		}
		
		return objeto;
		
	}
	
	public void calcularUtilidadNeta() throws NotFoundIngresosGastos {
		Cuenta m = null;
		Cuenta m1 = null;
		int resultados = 0;
		int ingreNop = 0;
		int gastosNop = 0;
		int utilidad = 0;
		
		m1 = utilidadBruta();
		utilidad = m1.getValor_c();
		
		for(int i = 0; i < ingresosNoOperacionales.size();i++) {
			ingreNop += ingresosNoOperacionales.get(i).getCodigo_c();
		}
		
		for(int j = 0; j < gastosNoOperacionales.size();j++) {
			gastosNop += gastosNoOperacionales.get(j).getCodigo_c();
		}
		
		resultados = (utilidad+ingreNop)-gastosNop;
		
		m = new Cuenta("Utilidad Neta",3606,AdministradorCuentas.UTILIDAD,resultados);
		
		setUtilidadNeta(m);
		
	}
	

}
