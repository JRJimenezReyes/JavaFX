package javafx.personalizacion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class EstilosHojaExterna extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		BorderPane raiz = new BorderPane();
		raiz.getStyleClass().add("raiz");

		HBox hbBotones = new HBox(10);
		hbBotones.setPadding(new Insets(10));
		hbBotones.setAlignment(Pos.CENTER_RIGHT);
		Button btAceptar = new Button("Aceptar");
		btAceptar.setId("btAceptar");
		Button btCancelar = new Button("Cancelar");
		btCancelar.setId("btCancelar");
		hbBotones.getChildren().addAll(btAceptar, btCancelar);

		raiz.setBottom(hbBotones);

		Scene escena = new Scene(raiz, 500, 500);
		escena.getStylesheets().add(getClass().getResource("/estilos/aplicacion.css").toExternalForm());
		escenarioPrincipal.setTitle("Hoja Estilos Externa");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}