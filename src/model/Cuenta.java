package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cuenta {
	
	public final static String CORRIENTE = "Corriente";
	public final static String NO_CORRIENTE = "No corriente";
	public final static String PATRIMONIO ="Patrimonio";
	public final static String GASTO = "Gasto";
	public final static String INGRESO = "Ingreso";
	
	private final SimpleStringProperty nombre_c;
	private final SimpleStringProperty codigo_c;
	private final SimpleStringProperty tipo_c;
	private SimpleIntegerProperty valor_c;
	
	

	public Cuenta(String nombre_c, String codigo_c, String tipo_c, int valor_c) {
		
		this.nombre_c = new SimpleStringProperty(nombre_c);
		this.codigo_c = new SimpleStringProperty(codigo_c);
		this.tipo_c = new SimpleStringProperty(tipo_c);
		this.valor_c = new SimpleIntegerProperty(valor_c);
	}

	public String getNombre_c() {
		return nombre_c.get();
	}

	public void setNombre_c(String nombre) {
		this.nombre_c.set(nombre);
	}

	public String getCodigo_c() {
		return codigo_c.get();
	}

	public void setCodigo(String codigo) {
		this.codigo_c.set(codigo);
	}
	
	
	public void getTipo_c() {
		this.tipo_c.get();
	}
	
	public void setTipo_c(String tipo) {
		this.tipo_c.set(tipo);
	}

	public int getValor() {
		return valor_c.get();
	}

	public void setValor(int valor) {
		this.valor_c.set(valor);
	}
	
	
}
