package javafx.controles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Acordeon extends Application {
    @Override
    public void start(Stage escenarioPrincipal) {
        Accordion raiz = new Accordion();
        raiz.setPadding(new Insets(20, 20, 20, 20));

        Image logo1 = new Image(getClass().getResourceAsStream("/imagenes/logo-ies.png"), 200, 200, true, true);
        Image logo2 = new Image(getClass().getResourceAsStream("/imagenes/logo-ies2.png"), 200, 200, true, true);

        TitledPane tlpClaro = new TitledPane("Logo claro", new ImageView(logo1));
        TitledPane tlpOscuro = new TitledPane("Logo oscuro", new ImageView(logo2));

        raiz.getPanes().addAll(tlpClaro, tlpOscuro);
        raiz.setExpandedPane(tlpOscuro);

        Scene escena = new Scene(raiz, 250, 300);
        escenarioPrincipal.setTitle("Acordeón");
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
