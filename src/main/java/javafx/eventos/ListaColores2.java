package javafx.eventos;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ListaColores2 extends Application {
	
	private class CeldaColor extends ListCell<String> {
        @Override
        public void updateItem(String color, boolean vacio) {
            super.updateItem(color, vacio);
            Pane colorMostrado = new Pane();
            colorMostrado.setMinSize(70, 20);
            colorMostrado.setMaxSize(70, 20);
            colorMostrado.setStyle(ESTILO_PANEL);
            if (color != null) {
                colorMostrado.setStyle(ESTILO_PANEL + "-fx-background-color: " + color + ";");
                setGraphic(colorMostrado);
            } else {
            	setGraphic(null);
            }
        }
    }
	
	private static final ObservableList<String> COLORES = FXCollections.observableArrayList(
            "Red", "Maroon", "Pink", "PaleVioletRed", "Moccasin",
            "Orange", "Wheat", "Peru", "SaddleBrown", "LightYellow",
            "Gold", "LawnGreen", "Green", "Aquamarine", "Teal",
            "CornflowerBlue", "MidnightBlue", "Violet", "DarkMagenta", "Indigo");
	private static final String ESTILO_PANEL = "-fx-border-color: gray; -fx-border-radius: 5; -fx-background-radius: 5; ";

	private Pane panel;
	
	private void mostrarColor(String color) {
		panel.setStyle(ESTILO_PANEL + "-fx-background-color: " + color + ";");
	}
	
	@Override
	public void start(Stage escenarioPrincipal) {
		HBox raiz = new HBox(20);
		raiz.setPadding(new Insets(30));
		raiz.setAlignment(Pos.BOTTOM_CENTER);

		VBox hbOpciones =new VBox(20);
		raiz.setAlignment(Pos.CENTER);

		Label lbElige = new Label("Elige el color");
		lbElige.setFont(Font.font(20));
		ListView<String> lvColores = new ListView<>(COLORES);
		lvColores.setPrefWidth(80);
		lvColores.getSelectionModel().select("Red");
		lvColores.getSelectionModel().selectedItemProperty().addListener((ov, viejo, nuevo) -> mostrarColor(nuevo));
		lvColores.setCellFactory(l -> new CeldaColor());
		hbOpciones.getChildren().addAll(lbElige, lvColores);

		panel = new Pane();
		panel.setMinSize(140, 140);
		panel.setMaxSize(140, 140);
		panel.setStyle(ESTILO_PANEL + "-fx-background-color: Red;");

		raiz.getChildren().addAll(hbOpciones, panel);

		Scene escena = new Scene(raiz, 430, 200);
		escenarioPrincipal.setTitle("Elige un color");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
