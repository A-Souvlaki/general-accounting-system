package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.AdministradorCuentas;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	private static AdministradorCuentas ac;

	@Override
	public void start(Stage arg0) throws Exception {

			try {
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("balance.fxml"));
				Pane root = (Pane) loader.load();
				root.getStylesheets().add("/application/application.css");
				root.getStyleClass().add("pane");
				Scene scene = new Scene(root);
				arg0.setResizable(false);
				arg0.setScene(scene);
				arg0.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
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
