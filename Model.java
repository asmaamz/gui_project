package Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class Model {
    Stage stage;

    public void gotToPage(ActionEvent event, String page) {
        Parent parent= null;

        FXMLLoader Loader=new FXMLLoader();
        Loader.setLocation(getClass().getResource(page));
        try {
            Loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        parent=Loader.getRoot();
        Scene scene=new Scene(parent);
            stage=new Stage();
            stage.setScene(scene);
            stage.show();


    }

}
