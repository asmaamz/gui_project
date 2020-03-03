package Controller;

import Model.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class course_list implements Initializable {
    public Connection connection;
    @FXML
    TableView list_of_courses;

    String user;
    public void load_log_out(ActionEvent actionEvent) {
    }

    public void load_view_edit_profile(ActionEvent actionEvent) {
    }

    public void load_view_my_attendance(ActionEvent actionEvent) {
    }

    public void load_courses_list(ActionEvent actionEvent) {
    }

    public void getText(String name){
        user=name;
    }
    @Override
    public void initialize (URL location, ResourceBundle resources) {
        ArrayList<String> courses=new ArrayList<>();
        try {
            connection = DBHandler.getDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            ResultSet resultSet = connection.createStatement().executeQuery("select sid from " + "student where sname="+user);


            while (resultSet.next()) {
                ResultSet resultSet1=connection.createStatement().executeQuery("select cid from student_has_course where sid="+resultSet.getInt(0));
                while(resultSet1.next()){
                    ResultSet resultSet2=connection.createStatement().executeQuery("select cname from course where cid="+resultSet1.getInt(0));
                    courses.add(resultSet2.getString(0));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int i=courses.size();
        while(i>0){
            System.out.println(courses.get(i));
            i--;
        }
    }
}
