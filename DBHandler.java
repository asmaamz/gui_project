package Model;

import java.sql.*;

public class DBHandler {
    protected static String url,uname,pass;
    protected static Connection connect;
    protected static Statement state;
    protected static DBHandler dbhandler;
    private DBHandler() throws Exception{
        url="jdbc:mysql://localhost:3306/AttendanceManagementSystem";

        uname="root";
        pass="asmaamz12";
        connect=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        try{
            connect = DriverManager.getConnection(url, uname, pass);
            System.out.println("SQL Connection to database established!");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        }
            state=connect.createStatement();


    }

    public static Connection getDatabase() throws Exception{
        if(dbhandler==null)
            dbhandler=new DBHandler();
        return connect;

    }

    public static void getStudents() throws SQLException {
        state=connect.createStatement();
        String get="select name,id from Student ";
        ResultSet rs= state.executeQuery(get);
       // rs.next();
        while (rs.next()){
           String name= rs.getString(1);
           String id= rs.getString(2);

        }
    }


}
