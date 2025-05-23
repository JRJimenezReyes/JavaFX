package javafx.personalizacion;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class EstilosNodos extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		BorderPane raiz = new BorderPane();
		raiz.setStyle("-fx-base: #ffe4c4;"
				+ "-fx-background-image: url('/imagenes/logo-ies3.png');"
				+ "-fx-background-position: center;"
				+ "-fx-background-repeat: no-repeat;");

		HBox hbBotones = new HBox(10);
		hbBotones.setPadding(new Insets(10));
		hbBotones.setAlignment(Pos.CENTER_RIGHT);
		Button btAceptar = new Button("Aceptar");
		btAceptar.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		Button btCancelar = new Button("Cancelar");
		btCancelar.setStyle("-fx-font: 20 arial; -fx-base: #dc143c;");
		hbBotones.getChildren().addAll(btAceptar, btCancelar);

		raiz.setBottom(hbBotones);

		Scene escena = new Scene(raiz, 500, 500);
		escenarioPrincipal.setTitle("Estilos de nodos");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}