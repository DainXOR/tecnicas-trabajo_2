package udea.tecnicas.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TemplateLogin {
    @FXML
    protected void onLoginButtonClick(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TemplateMenu.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 1200, 600);
            stage.setTitle("CorAntioquia!");
            stage.setScene(scene);
            stage.show();
            System.out.println("new Window");
        }catch (LoadException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
    @FXML
    protected void onButtonClick(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TemplateMenu.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 1200, 600);
            stage.setTitle("CorAntioquia!");
            stage.setScene(scene);
            stage.show();
            System.out.println("new Window");
            //Stage.getWindows().getFirst().hide();
        }catch (LoadException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
    void closeWindow(ActionEvent event){
        ((Node)event.getSource()).getScene().getWindow().hide();
    }

}
