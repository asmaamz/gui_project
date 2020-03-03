package Model;

import java.util.ArrayList;

public class Teacher{
    /* public String teacher_username;
     public String teacher_password;*/
     public String tname;
     public int tid;
     public String tgender;
     public String t_email;
     public String tphone;
     public String address;

    /*  public Teacher(String teacher_username,
                     String teacher_password){
          super(teacher_username,teacher_password);
      }/* */
       public ArrayList<Integer> teaches;
       int department;

       public ArrayList<Integer> getTeaches() {
           return teaches;
       }

       public void setTeaches(ArrayList<Integer> teaches) {
         this.teaches = teaches;
       }

      public Integer getDepartment() {
           return department;
       }

       public void setDepartment(int department) {
           this.department = department;
       }

    public Integer getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
/*
    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }
*/

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getT_email() {
        return t_email;
    }

    public void setT_email(String t_email) {
        this.t_email = t_email;
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
