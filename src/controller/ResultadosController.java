package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ResultadosController implements Initializable{
	
	@FXML
	private Text activosC;
	
	@FXML
	private Text activosNC;
	
	@FXML
	private Text pasivosC;
	
	@FXML
	private Text pasivosNC;
	
	@FXML
	private Text sumaActivos;
	
	@FXML
	private Text sumaPasivosPatrimonio;
	
	void init() {
		
		if (Main.getAc().getBg().sumaActivosCorrientes() != 0) {
			activosC.setText("" +Main.getAc().getBg().sumaActivosCorrientes());
			activosC.setFill(Color.DARKSLATEGREY);
		}else {
			activosC.setText(""+0);
			activosC.setFill(Color.DARKSLATEGREY);
		}
		
		if (Main.getAc().getBg().sumaActivosNoCorrientes() != 0) {
			activosNC.setText("" +Main.getAc().getBg().sumaActivosNoCorrientes());
			activosNC.setFill(Color.DARKSLATEGREY);
		}else {
			activosNC.setText(""+0);
			activosNC.setFill(Color.DARKSLATEGREY);
		}
		
		if (Main.getAc().getBg().sumaPasivosCorrientes() != 0) {
			pasivosC.setText("" +Main.getAc().getBg().sumaPasivosCorrientes());
			pasivosC.setFill(Color.DARKSLATEGREY);
		}else {
			pasivosC.setText(""+0);
			pasivosC.setFill(Color.DARKSLATEGREY);
		}
		
		if (Main.getAc().getBg().sumaPasivosNoCorrientes() != 0) {
			pasivosNC.setText("" +Main.getAc().getBg().sumaPasivosNoCorrientes());
			pasivosNC.setFill(Color.DARKSLATEGREY);
		}else {
			pasivosNC.setText(""+0);
			pasivosNC.setFill(Color.DARKSLATEGREY);
		}
		
		if (Main.getAc().getBg().sumaPasivos() != 0) {
			pasivosNC.setText("" +Main.getAc().getBg().sumaPasivos());
		}else {
			pasivosNC.setText(""+0);
			pasivosNC.setFill(Color.DARKSLATEGREY);
		}
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		init();
		
	}
	

}
