package udea.tecnicas.view;
//import com.gluonhq.charm.glisten.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.scene.layout.Panel;

import java.io.IOException;

public class TemplateMenu {
    @FXML
    private Pane Panel1;
    @FXML
    private Pane Panel2;

    @FXML
    protected void MenuLicenciasClick(){
        System.out.println("Boton Menu Clicleado");
        hideoption1();
    }

    private void hideoption1(){
        Panel2.setVisible(!Panel2.visibleProperty().get());
    }
}
