package javafx.controles;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CajasEleccion extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox();
		raiz.setPadding(new Insets(40));
		raiz.setSpacing(10);

		Label lbElige = new Label("Elige los extras:");
		lbElige.setFont(Font.font(20));

		ChoiceBox<String> cbExtras = new ChoiceBox<>();
		cbExtras.setItems(FXCollections.observableArrayList("Navegador", "Manos libres", "Lunas tintadas"));

		raiz.getChildren().addAll(lbElige, cbExtras);

		Scene escena = new Scene(raiz, 350, 200);
		escenarioPrincipal.setTitle("Cajas de elección");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

