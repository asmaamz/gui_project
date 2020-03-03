package Controller;

import Model.DBHandler;
import Model.Model;
import Model.person;
import Model.Teacher;
import Model.Student;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class login_Controller implements Initializable {
    public Connection connection;
    @FXML
    public RadioButton student, teacher, hod;
    @FXML
    public TextField username, password;

    protected Model model;

    @FXML
    Button login;

    public ToggleGroup toggleGroup;

    String choice;

    String user,pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            connection = DBHandler.getDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        toggleGroup = new ToggleGroup();
        student.setUserData("student");
        student.setToggleGroup(toggleGroup);
        teacher.setUserData("teacher");
        teacher.setToggleGroup(toggleGroup);
        hod.setUserData("Head of Department");
        hod.setToggleGroup(toggleGroup);


    }

    @FXML
    public void login(ActionEvent event) throws IOException {

        model = new Model();
        choice = toggleGroup.getSelectedToggle().getUserData().toString();

        if(choice.equals("student")){
        FXMLLoader Loader=new FXMLLoader();
        Loader.setLocation(getClass().getResource("../View/student_page.fxml"));
        Loader.load();
            try {
                ResultSet resultSet = connection.createStatement().executeQuery("select * from " + "student");

                while (resultSet.next()) {

                    if (resultSet.getString(2).equals(username.getText().trim())) {
                        user = username.getText().trim();
                        if (resultSet.getString(3).equals(password.getText().trim())) {
                            pass = password.getText().trim();
                            student_page student_page = Loader.getController();
                            student_page.setText(resultSet.getString(4));
                            Parent parent = Loader.getRoot();
                            Scene scene = new Scene(parent);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.show();
                            return;
                        }else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error");
                            alert.setHeaderText("Username or Password are Incorrect");
                            alert.setContentText("Make sure that you typed the correct username or password, if yes visit the head of department");


                            Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
                            alert.setX(500);
                            alert.setY(250);
                            alert.showAndWait();
                            return;
                        }
                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

            if(choice.equals("teacher")) {
                FXMLLoader Loader2 = new FXMLLoader();
                Loader2.setLocation(getClass().getResource("../View/teacher_page.fxml"));
                Loader2.load();
                try {
                    ResultSet resultSet = connection.createStatement().executeQuery("select * from " + "teacher");

                    while (resultSet.next()) {

                        if (resultSet.getString(2).equals(username.getText().trim())) {
                            user = username.getText().trim();
                            if (resultSet.getString(3).equals(password.getText().trim())) {
                                pass = password.getText().trim();
                                student_page student_page = Loader2.getController();
                                student_page.setText(resultSet.getString(4));
                                Parent parent = Loader2.getRoot();
                                Scene scene = new Scene(parent);
                                Stage stage = new Stage();
                                stage.setScene(scene);
                                stage.show();
                                return;
                            }
                        } else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error");
                            alert.setHeaderText("Username or Password are Incorrect");
                            alert.setContentText("Make sure that you typed the correct username or password, if yes visit the head of department");


                            Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
                            alert.setX(500);
                            alert.setY(250);
                            alert.showAndWait();
                            return;
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

                if(choice.equals("Head of Department")) {
                    FXMLLoader Loader3 = new FXMLLoader();
                    Loader3.setLocation(getClass().getResource("../View/HOD_page.fxml"));
                    Loader3.load();
                    try {
                        ResultSet resultSet = connection.createStatement().executeQuery("select * from " + "teacher");

                        while (resultSet.next()) {

                            if (resultSet.getString(2).equals(username.getText().trim())) {
                                user = username.getText().trim();
                                if (resultSet.getString(3).equals(password.getText().trim())) {
                                    pass = password.getText().trim();
                                    student_page student_page = Loader3.getController();
                                    student_page.setText( resultSet.getString(4));
                                    Parent parent = Loader3.getRoot();
                                    Scene scene = new Scene(parent);
                                    Stage stage = new Stage();
                                    stage.setScene(scene);
                                    stage.show();
                                    return;
                                }
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Error");
                                alert.setHeaderText("Username or Password are Incorrect");
                                alert.setContentText("Make sure that you typed the correct username or password, if yes visit the head of department");


                                Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
                                alert.setX(500);
                                alert.setY(250);
                                alert.showAndWait();
                                return;
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }


            }

    }

}

