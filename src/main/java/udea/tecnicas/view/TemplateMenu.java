package udea.tecnicas.view;
//import com.gluonhq.charm.glisten.*;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.gluonhq.charm.glisten.control.Icon;

public class TemplateMenu {
    @FXML
    private Pane Panel1;
    @FXML
    private Pane Panel2;
    @FXML
    private AnchorPane Contenido;
    @FXML
    private Rectangle RectanguloMenu10;
    @FXML
    private Rectangle RectanguloMenu11;
    @FXML
    private Rectangle RectanguloMenu20;
    @FXML
    private Rectangle RectanguloMenu21;
    @FXML
    private Group GroupMenu10;
    @FXML
    private Group GroupMenu11;
    @FXML
    private Group GroupMenu20;
    @FXML
    private Group GroupMenu21;



    @FXML
    protected void MenuLicenciasClick(){
        hideoption1();
    }
    @FXML
    protected void MenuClic(MouseEvent event){
        Rectangle RectangleClicked =(Rectangle)event.getSource();
        ResaltarMenu(RectangleClicked.getId());

    }
    private void ResaltarMenu(String idRectangle){
        Color color_activo = Color.rgb(226,226,226);
        Color color_inactivo = Color.rgb(255,255,255);
        if(idRectangle.contains("RectanguloMenu1")){
            if (idRectangle.equals("RectanguloMenu10"))
            {
                RectanguloMenu10.setFill(color_activo);
                RectanguloMenu11.setFill(color_inactivo);
            }
            if (idRectangle.equals("RectanguloMenu11"))
            {
                RectanguloMenu11.setFill(color_activo);
                RectanguloMenu10.setFill(color_inactivo);
            }
        }
    }

    private void hideoption1(){
        Contenido.getChildren().get(0).setVisible(!Contenido.getChildren().get(0).visibleProperty().get());
        Contenido.getChildren().get(1).setVisible(!Contenido.getChildren().get(1).visibleProperty().get());
    }
}
