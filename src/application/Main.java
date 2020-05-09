package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.AdministradorCuentas;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private static AdministradorCuentas ac;

	@Override
	public void start(Stage arg0) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("balance.fxml"));
		arg0.setScene(new Scene(root));
		arg0.setResizable(true);
		arg0.show();

	}

	public static void main(String[] args) {
		ac = new AdministradorCuentas();
		launch(args);

	}

	public static AdministradorCuentas getAc() {
		return ac;
	}

	public static void setAc(AdministradorCuentas ac) {
		Main.ac = ac;
	}

	

}
