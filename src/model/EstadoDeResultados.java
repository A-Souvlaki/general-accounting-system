package model;

import java.util.ArrayList;

import Exceptions.*;

public class EstadoDeResultados {
	
	private ArrayList<Cuenta> activos;
	
	private ArrayList<Cuenta> pasivos;
	
	private ArrayList<Integer> ingresos;
	
	private ArrayList<Integer> gastos;
	
	private Cuenta capital;
	
	private Cuenta reserva;
	
	private Cuenta utilidad;
	

	private int calculateUtility() throws notFoundIngresosGastos {
		int resultado = 0;
		
		int ingresosCalculo = 0;
		int gastosCalculo = 0;
		
		if(!ingresos.isEmpty() && !gastos.isEmpty() ) {
			
		for(int i = 0; i < ingresos.size();i++) {
			ingresosCalculo += ingresos.get(i);
		}
		
		for(int j = 0; j < gastos.size();j++) {
			gastosCalculo += ingresos.get(j);
		}
		
		resultado = ingresosCalculo - gastosCalculo;
		
		
		}else {
			throw new notFoundIngresosGastos("");
		}
		
		return resultado;
	}
	
	private int calculateG(int utilidad,int ingresos) {
		int resultado = 0;
		
		
		
		return resultado;
	}

}
