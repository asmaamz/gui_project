package Controller;

import Model.DBHandler;
import Model.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class student_page implements Initializable {
    @FXML
    Label student_name;

    public Connection connection;

    Student student;


    public void load_courses_list(ActionEvent actionEvent){
       FXMLLoader Loader=new FXMLLoader();
        Loader.setLocation(getClass().getResource("../View/course_list_page.fxml"));
        try {
            Loader.load(getClass().getResource("../View/course_list_page.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        course_list courses = Loader.getController();
        courses.getText(student_name.getText());
        Parent parent = Loader.getRoot();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void load_view_my_attendance(ActionEvent actionEvent) {
    }

    public void load_view_edit_profile(ActionEvent actionEvent) {
    }

    public void load_log_out(ActionEvent actionEvent) {
    }

    public void setText(String name){
        student_name.setText(name);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            connection = DBHandler.getDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }

     /*   try {

            ResultSet resultSet = connection.createStatement().executeQuery("select * from student");
            while (resultSet.next()) {

                if (resultSet.getString(2).equals(student.getUsername())) {
                    student_name.setText(resultSet.getString(4));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }

}
