package javafx.controles;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Separadores extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox();
		raiz.setPadding(new Insets(40));
		raiz.setSpacing(10);

		Label lbElige = new Label("Elige el día:");
		lbElige.setFont(Font.font(20));

		ComboBox<Object> cbExtras = new ComboBox<>();
		Separator separador = new Separator();
		ObservableList<Object> dias = FXCollections.observableArrayList(
				"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", separador, "Sábado", "Domingo");
		cbExtras.getItems().addAll(dias);

		raiz.getChildren().addAll(lbElige, cbExtras);

		Scene escena = new Scene(raiz, 350, 200);
		escenarioPrincipal.setTitle("Separadores");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}


