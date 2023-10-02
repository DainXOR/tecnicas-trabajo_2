module udea.tecnicas.view {
    requires javafx.controls;
    requires javafx.fxml;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;


    opens udea.tecnicas.view to javafx.fxml;
    exports udea.tecnicas.view;
}