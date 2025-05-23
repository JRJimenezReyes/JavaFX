package javafx.controles;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Menus extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		VBox raiz = new VBox();

		MenuBar mbPrincipal = new MenuBar();
		Menu mFichero = new Menu("Fichero");
		MenuItem miAbrir = new MenuItem("Abrir");
		MenuItem miGuardar = new MenuItem("Guardar");
		SeparatorMenuItem separador = new SeparatorMenuItem();
		MenuItem miSalir = new MenuItem("Salir");
		mFichero.getItems().addAll(miAbrir, miGuardar, separador, miSalir);
		Menu mAyuda = new Menu("Ayuda");
		MenuItem miAcercaDe = new MenuItem("Acerca de...");
		mAyuda.getItems().add(miAcercaDe);
		mbPrincipal.getMenus().addAll(mFichero, mAyuda);

		Image logo = new Image(getClass().getResourceAsStream("/imagenes/logo-ies2.png"), 200, 200, true, true);
		ImageView ivLogo = new ImageView(logo);

		raiz.getChildren().addAll(mbPrincipal, ivLogo);

		Scene escena = new Scene(raiz, 200, 230);
		escenarioPrincipal.setTitle("Menús");
		escenarioPrincipal.setScene(escena);
		escenarioPrincipal.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
