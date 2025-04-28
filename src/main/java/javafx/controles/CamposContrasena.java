package javafx.controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CamposContrasena extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		HBox raiz = new HBox();
		raiz.setPadding(new Insets(40));
		raiz.setSpacing(10);
		raiz.setAlignment(Pos.CENTER_LEFT);

		Label lbContrasena = new Label("Contraseña:");

		PasswordField pfContrasena = new PasswordField();

		raiz.getChildren().addAll(lbContrasena, pfContrasena);

		Scene escena = new Scene(raiz, 350, 100);
		escenarioPrincipal.setTitle("Campos de contraseña");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}



