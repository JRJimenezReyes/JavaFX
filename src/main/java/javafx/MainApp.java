package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			VBox raiz = FXMLLoader.load(getClass().getResource("/vistas/EjecutarEjemplo.fxml"));
			Scene escena = new Scene(raiz);
			escenarioPrincipal.setTitle("Ejemplos JavaFX");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.getIcons().add(new Image(getClass().getResourceAsStream("/imagenes/iconoCaca.png")));
			escenarioPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
