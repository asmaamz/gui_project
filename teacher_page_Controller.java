package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class teacher_page_Controller {
    Stage stage=new Stage();

    @FXML
    private AnchorPane students_list_anchorpane;

    @FXML
    void load_students_list(ActionEvent event) throws Exception {
        Parent pane= FXMLLoader.load(getClass().getResource("../View/student_list_page.fxml"));
        students_list_anchorpane.getChildren().setAll(pane);
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void load_courses_list(ActionEvent event) {

    }

    @FXML
    void mark_attendance(ActionEvent event) {

    }


    @FXML
    void load_view_update_attendance(ActionEvent event) {

    }

    @FXML
    void load_attendance_history(ActionEvent event) {

    }



    @FXML
    void load_absence_presence_calc(ActionEvent event) {

    }


    @FXML
    void load_view_edit_profile(ActionEvent event) {

    }


    @FXML
    void load_log_out(ActionEvent event) {

    }
}
