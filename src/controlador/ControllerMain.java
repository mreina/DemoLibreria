package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("../vista/acceso.fxml"));
		Scene escena = new Scene(root);
		primaryStage.setScene(escena);
		primaryStage.setTitle("Libreria Cheshire");
		primaryStage.show();
	}
	
	public static void main(String [] args){
		launch(args);
	}

}
