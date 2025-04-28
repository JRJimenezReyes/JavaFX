package javafx.eventos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DeterminarBotonPulsado extends Application {
	
	private Button boton1;
	private Button boton2;
	private Button boton3;
	private Label etiqueta;
	
	private void botonPulsado(ActionEvent e) {
		if (e.getSource() == boton1) {
			etiqueta.setText("Se ha pulsado el botón 1");
		} else if (e.getSource() == boton2) {
			etiqueta.setText("Se ha pulsado el botón 2");
		} else if (e.getSource() == boton3) {
			etiqueta.setText("Se ha pulsado el botón 3");
		}
	}
	
	private void ponerSombra(MouseEvent e) {
		Button boton = (Button)e.getSource();
		boton.setEffect(new DropShadow());
	}
	
	private void quitarSombra(MouseEvent e) {
		Button boton = (Button)e.getSource();
		boton.setEffect(null);
	}

	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox(20);
		raiz.setPadding(new Insets(10));
		raiz.setAlignment(Pos.CENTER);

		HBox hbBotones =new HBox(30);
		hbBotones.setPadding(new Insets(10));
		hbBotones.setAlignment(Pos.CENTER);

		Font tipoLetra = Font.font("Arial", 16);
		boton1 = new Button("Botón 1");
		boton1.setFont(tipoLetra);
		boton1.setOnAction(this::botonPulsado);
		boton1.setOnMouseEntered(this::ponerSombra);
		boton1.setOnMouseExited(this::quitarSombra);
		boton2 = new Button("Botón 2");
		boton2.setFont(tipoLetra);
		boton2.setOnAction(this::botonPulsado);
		boton2.setOnMouseEntered(this::ponerSombra);
		boton2.setOnMouseExited(this::quitarSombra);
		boton3 = new Button("Botón 3");
		boton3.setFont(tipoLetra);
		boton3.setOnAction(this::botonPulsado);
		boton3.setOnMouseEntered(this::ponerSombra);
		boton3.setOnMouseExited(this::quitarSombra);
		hbBotones.getChildren().addAll(boton1, boton2, boton3);

		etiqueta = new Label();
		etiqueta.setFont(Font.font("Arial", 24));

		raiz.getChildren().addAll(hbBotones, etiqueta);

		Scene escena = new Scene(raiz, 450, 150);
		escenarioPrincipal.setTitle("¿Qué botón se ha pulsado?");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
