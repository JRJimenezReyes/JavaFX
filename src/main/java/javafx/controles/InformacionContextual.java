package javafx.controles;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class InformacionContextual extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		HBox raiz = new HBox();
		raiz.setPadding(new Insets(20, 20, 20, 20));
		raiz.setSpacing(10);
		raiz.setAlignment(Pos.CENTER);

		Button btBeber = new Button();

		Image imgCerveza = new Image(getClass().getResourceAsStream("/imagenes/iconoCerveza.png"), 50, 50, true, true);
		btBeber.setGraphic(new ImageView(imgCerveza));
		btBeber.setText("Beber");
		btBeber.setGraphicTextGap(20);
		btBeber.setFont(Font.font("Ani", 30));

		Tooltip infoCerveza = new Tooltip("Haz un descanso y bébete una cerveza, pero no se te ocurra abusar");
		Image imgApagar = new Image(getClass().getResourceAsStream("/imagenes/iconoApagar.png"), 50, 50, true, true);
		infoCerveza.setGraphic(new ImageView(imgApagar));
		infoCerveza.setFont(Font.font(15));
		infoCerveza.setPrefWidth(200);
		infoCerveza.setWrapText(true);
		btBeber.setTooltip(infoCerveza);

		raiz.getChildren().addAll(btBeber);

		Scene escena = new Scene(raiz, 400, 120);
		escenarioPrincipal.setTitle("Información contextual");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
