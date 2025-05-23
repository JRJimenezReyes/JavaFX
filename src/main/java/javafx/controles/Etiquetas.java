package javafx.controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Etiquetas extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		HBox raiz = new HBox();
		raiz.setPadding(new Insets(50, 50, 50, 50));
		raiz.setSpacing(30);

		Label lbImagen = new Label();
		Label lbRotada = new Label();
		Label lbCortada = new Label();

		Image imagen = new Image(getClass().getResourceAsStream("/imagenes/iconoCaca.png"), 100, 100, true, true);
		lbImagen.setGraphic(new ImageView(imagen));

		lbRotada.setText("Etiqueta");
		lbRotada.setFont(Font.font("Ani", 40));
		lbRotada.setMinWidth(150);
		lbRotada.setRotate(-50);

		lbCortada.setWrapText(true);
		lbCortada.setText("Esta es otra etiqueta que no cabe y debe ser cortada en varias líneas");

		raiz.getChildren().addAll(lbImagen, lbRotada, lbCortada);

		Scene escena = new Scene(raiz, 500, 200);
		escenarioPrincipal.setTitle("Etiquetas");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
