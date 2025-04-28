package javafx.aplicacionfxml;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainApp extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			Parent raiz = FXMLLoader.load(getClass().getResource("/vistas/Ejemplo.fxml"));
			Scene escena = new Scene(raiz);
			escena.getStylesheets().add(getClass().getResource("/estilos/aplicacion.css").toExternalForm());
			escenarioPrincipal.setTitle("Ejemplo FXML");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
