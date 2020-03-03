package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class student_list_page_Controller {
    @FXML
    Button students_list;

    public void load_students_list(ActionEvent actionEvent) {
        students_list.setDisable(true);
    }

    public void load_courses_list(ActionEvent actionEvent) {
    }

    public void mark_attendance(ActionEvent actionEvent) {
    }

    public void load_view_update_attendance(ActionEvent actionEvent) {
    }

    public void load_attendance_history(ActionEvent actionEvent) {
    }

    public void load_absence_presence_calc(ActionEvent actionEvent) {
    }

    public void load_view_edit_profile(ActionEvent actionEvent) {
    }

    public void load_log_out(ActionEvent actionEvent) {
    }
}
