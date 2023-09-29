package udea.tecnicas.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
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
            Scene scene = new Scene(fxmlLoader.load(), 800, 400);
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 800, 400);
            stage.setTitle("CorAntioquia!");
            stage.setScene(scene);
            stage.show();
        }catch (LoadException e){
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());

            System.out.println(e.getStackTrace());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
