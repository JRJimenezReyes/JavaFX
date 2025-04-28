package javafx.eventos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CampoTextoLongitudMaxima extends Application {
	
	private Label lbInfo;
	private TextField tfTexto;
	private static final int MAX_CARACTERES = 10;
	private final AudioClip BEEP = new AudioClip(getClass().getResource("/sonidos/beep.mp3").toExternalForm());

	private void controlaTamanoTexto(String textoAntiguo) {
		String texto = tfTexto.getText();
		if (texto.length() <= MAX_CARACTERES) {
			lbInfo.setText("Longitud: " + texto.length() + " caracteres");
		} else {
			tfTexto.setText(textoAntiguo);
			BEEP.play();
		}
	}

	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox(20);
		raiz.setPadding(new Insets(10));
		raiz.setAlignment(Pos.CENTER);

		HBox hbTexto =new HBox(30);
		hbTexto.setPadding(new Insets(10));
		hbTexto.setAlignment(Pos.CENTER);

		Label lbTexto = new Label("Introduce texto \n(máximo " + MAX_CARACTERES + " caracteres)");
		lbTexto.setWrapText(true);
		lbTexto.setFont(Font.font("Arial", 14));
		tfTexto = new TextField();
		tfTexto.textProperty().addListener((observable, oldValue, newValue) -> controlaTamanoTexto(oldValue));
		hbTexto.getChildren().addAll(lbTexto, tfTexto);

		lbInfo = new Label("Longitud: 0 caracteres");
		lbInfo.setFont(Font.font("Arial", 24));

		raiz.getChildren().addAll(hbTexto, lbInfo);

		Scene escena = new Scene(raiz, 450, 150);
		escenarioPrincipal.setTitle("Texto con tamaño máximo");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
