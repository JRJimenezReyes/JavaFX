package javafx.controles;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BarrasDesplazamiento extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		ScrollPane sp = new ScrollPane();
		Image imagen = new Image(getClass().getResourceAsStream("/imagenes/logo-ies.png"));
		sp.setContent(new ImageView(imagen));

		Scene escena = new Scene(sp, 500, 500);
		escenarioPrincipal.setTitle("Panel de desplazamiento");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

