package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cuenta {
	
	
	
	private final SimpleStringProperty nombre_c;
	private final SimpleIntegerProperty codigo_c;
	private final SimpleStringProperty estado_m;
	private final SimpleIntegerProperty valor_c;
	
	

	public Cuenta(String nombre_c, int codigo_c, String estado_m, int valor_c) {
		
		this.nombre_c = new SimpleStringProperty(nombre_c);
		this.codigo_c = new SimpleIntegerProperty(codigo_c);
		this.estado_m = new SimpleStringProperty(estado_m);
		this.valor_c = new SimpleIntegerProperty(valor_c);
	}

	public String getNombre_c() {
		return nombre_c.get();
	}

	public void setNombre_c(String nombre) {
		this.nombre_c.set(nombre);
	}

	public int getCodigo_c() {
		return codigo_c.get();
	}

	public void setCodigo_c(int codigo) {
		this.codigo_c.set(codigo);
	}
	

	public String getEstado_m() {
		return this.estado_m.get();
	}
	
	public void setTipo_m(String tipo) {
		this.estado_m.set(tipo);
	}

	public int getValor_c() {
		return valor_c.get();
	}

	public void setValor_c(int valor) {
		this.valor_c.set(valor);
	}
	
	
}
