package Model;

public class person {
    String username,password,name,gender,email,phone,address;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public person(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
