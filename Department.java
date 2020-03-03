package Model;

import java.util.ArrayList;

public class Department {

    public String dname;
    ArrayList<Teacher> teachers;

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }



}
