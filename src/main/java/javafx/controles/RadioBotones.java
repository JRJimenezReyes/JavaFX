package javafx.controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RadioBotones extends Application{

	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox();
		raiz.setPadding(new Insets(40));
		raiz.setSpacing(10);

		Label lbElige = new Label("Elige el tamaño:");
		lbElige.setFont(Font.font(20));

		RadioButton rbGrande = new RadioButton("Grande");
		RadioButton rbMediano = new RadioButton("Mediano");
		rbMediano.setSelected(true);
		RadioButton rbPequeno = new RadioButton("Pequeño");

		ToggleGroup tamanos = new ToggleGroup();
		rbGrande.setToggleGroup(tamanos);
		rbMediano.setToggleGroup(tamanos);
		rbPequeno.setToggleGroup(tamanos);

		VBox.setMargin(rbGrande, new Insets(0, 0, 0, 30));
		VBox.setMargin(rbMediano, new Insets(0, 0, 0, 30));
		VBox.setMargin(rbPequeno, new Insets(0, 0, 0, 30));

		raiz.getChildren().addAll(lbElige, rbGrande, rbMediano, rbPequeno);

		Scene escena = new Scene(raiz, 250, 190);
		escenarioPrincipal.setTitle("Radio botones");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}


}
