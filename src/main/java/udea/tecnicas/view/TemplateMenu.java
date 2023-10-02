package udea.tecnicas.view;
//import com.gluonhq.charm.glisten.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
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
    private AnchorPane Contenido;



    @FXML
    protected void MenuLicenciasClick(){

        hideoption1();



    }

    private void hideoption1(){
        Contenido.getChildren().get(0).setVisible(!Contenido.getChildren().get(0).visibleProperty().get());
        Contenido.getChildren().get(1).setVisible(!Contenido.getChildren().get(1).visibleProperty().get());
    }
}
