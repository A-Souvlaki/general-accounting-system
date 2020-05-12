package model;

import java.util.ArrayList;
import Exceptions.NotFoundIngresosGastos;

public class EstadoDeResultados {

	private ArrayList<Cuenta> ingresosOperacionales;
	
	private ArrayList<Cuenta> ingresosNoOperacionales;
	
	private ArrayList<Cuenta> gastosOperacionales;
	
	private ArrayList<Cuenta> gastosNoOperacionales;
	

	private Cuenta utilidadOperativa;
	
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

	public Cuenta getUtilidadOperativa() {
		return utilidadOperativa;
	}

	public void setUtilidadOperativa(Cuenta utilidadOperativa) {
		this.utilidadOperativa = utilidadOperativa;
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

	public int calculateUtility() throws NotFoundIngresosGastos {
		int resultado = 0;
		
		int ingresosCalculo = 0;
		int gastosCalculo = 0;
		
		boolean ingresosOp = ingresosOperacionales.isEmpty();
		
		boolean ingresosNOp = ingresosNoOperacionales.isEmpty();
		
		boolean GastosOp = gastosOperacionales.isEmpty();
		
		boolean GastosNOp = gastosNoOperacionales.isEmpty();
		
		
		
		if(ingresosOp && ingresosNOp && GastosOp && GastosNOp) {
			
			throw new NotFoundIngresosGastos("");
			
		}else {
			
		for(int i = 0; i < ingresosOperacionales.size();i++) {
			ingresosCalculo += ingresosOperacionales.get(i).getValor_c();
		}
		
		for(int o = 0; o < ingresosNoOperacionales.size();o++) {
			ingresosCalculo += ingresosNoOperacionales.get(o).getValor_c();
		}
		
		for(int k = 0; k < gastosOperacionales.size();k++) {
			gastosCalculo += gastosOperacionales.get(k).getValor_c();
		}
		
		for(int j = 0; j < gastosNoOperacionales.size();j++) {
			gastosCalculo += gastosNoOperacionales.get(j).getValor_c();
		}
		
		}
		
		resultado = ingresosCalculo - gastosCalculo;
		
		return resultado;
	}
	
	public void setCostoDeVenta(Cuenta costosDeVentas){
		
		setCostosDeVentas(costosDeVentas);
		
	}

	public void utilidadBruta() throws NotFoundIngresosGastos {
		
		int m = 0;
		
		if(ingresosOperacionales.isEmpty() && ingresosNoOperacionales.isEmpty()) {
			
			throw new NotFoundIngresosGastos("");
			
		}else {
		
		for(int i = 0; i < ingresosOperacionales.size();i++) {
			m += ingresosOperacionales.get(i).getValor_c();
		}
		
		for(int o = 0; o < ingresosNoOperacionales.size();o++) {
			m += ingresosNoOperacionales.get(o).getValor_c();
		}
		
		}
		
	}

}
