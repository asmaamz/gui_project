package Model;

import java.util.ArrayList;

public class Course {

    public int cid;
    public String Coursecode;
    public int credits;
    public String cname;
    public String cdescription;

     ArrayList<Integer> students;
    int taught_by;

    public ArrayList<Integer> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Integer> students) {
        this.students = students;
    }

    public Integer getTaught_by() {
        return taught_by;
    }

    public void setTaught_by(int taught_by) {
        this.taught_by = taught_by;
    }/*
*/
    public Course (int cid,String cname, String Coursecode,int credits, String cdescription)
    {
        this.cid=cid;
        this.cdescription=cdescription;
        this.Coursecode=Coursecode;
        this.cname=cname;
        this.credits=credits;
    }


   public Integer getCid() {
       return cid;
}


    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCoursecode() {
        return Coursecode;
    }

    public void setCoursecode(String coursecode) {
        Coursecode = coursecode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription;
    }
}
