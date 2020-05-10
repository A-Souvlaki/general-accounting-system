package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import exceptions.EmptyFieldException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Cuenta;

public class AgregarCuentaController implements Initializable{
	
	public final static String ACORRIENTE = "Activo Corriente";
	public final static String ANO_CORRIENTE = "Activo No corriente";
	public final static String PCORRIENTE = "Pasivo Corriente";
	public final static String PNO_CORRIENTE = "Pasivo No corriente";
	public final static String PATRIMONIO ="Patrimonio";
	public final static String GASTO = "Gasto";
	public final static String INGRESO = "Ingreso";
	public final static String COSTO = "Costo de Ventas";
	
	ObservableList<String> listA = FXCollections.observableArrayList();
	
	@FXML
	private TextField codigo;
	
	@FXML
	private TextField nombre;
	
	@FXML
	private TextField cantidad;
	
	@FXML
	private ChoiceBox<String> tipos;
	
	@FXML
	private Button volver;
	
	@FXML
	private Button guardar;
	
	void init(){
		
		guardar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				
				if (codigo.getText().equals("") || nombre.getText().equals("")) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Entrada no valida");
					alert.setHeaderText(null);
					alert.setContentText("Los campos no deben estar vacios");
					alert.showAndWait();
				}else {
					agregarCuenta();
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Exito");
					alert.setHeaderText(null);
					alert.setContentText("Su registro ha sido guardado");
					alert.showAndWait();
				}

			}
		});
		
		
		volver.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("/application/balance.fxml"));
					Scene scene = new Scene(root);
					Stage stage = new Stage();
					stage.setScene(scene);
					stage.centerOnScreen();
					stage.show();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});


		
	}
	
	void agregarCuenta() {
		try {
			Cuenta cuenta = new Cuenta(nombre.getText(),Integer.parseInt(codigo.getText()), tipos.getValue(), Integer.parseInt(cantidad.getText()));
			Main.getAc().getCuentas().add(cuenta);
			Main.getAc().actualizar();
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Entrada no valida");
			alert.setHeaderText(null);
			alert.setContentText("La entrada de valor fue tipada incorrectamente");
			alert.showAndWait();

		} catch (NullPointerException e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Entrada no valida");
			alert.setHeaderText(null);
			alert.setContentText("El tipo seleccionado es nulo");
			alert.showAndWait();
		}
		
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	void createBox() {
		listA.remove(listA);
		listA.addAll(ACORRIENTE,ANO_CORRIENTE,PCORRIENTE,PNO_CORRIENTE,PATRIMONIO,INGRESO,GASTO,COSTO);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		createBox();
		init();
		
	}



}
