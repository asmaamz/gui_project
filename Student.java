package Model;

import java.util.ArrayList;

public class Student{

    public int sid;
    public String sname;
    public String sgender;
    public String s_email;
    public String phone;
    public String saddress;
   /* public String student_username;
    public String student_password;*/
   // public ArrayList<Course> enrolled_in;




public Student (int sid,String sname, String sgender,String s_email,String phone,String saddress){
    this.sname = sname;
    this.saddress = saddress;
    this.sgender = sgender;
    this.phone = phone;
    this.s_email = s_email;
    this.sid = sid;


}
ArrayList<Integer> enrolled_in;
public ArrayList<Integer> getEnrolled_in() {

    return enrolled_in;
     }

      public void setEnrolled_in(ArrayList<Integer> enrolled_in) {
           this.enrolled_in = enrolled_in;
      }
    public Integer getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
/*
    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }


*/
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
}
