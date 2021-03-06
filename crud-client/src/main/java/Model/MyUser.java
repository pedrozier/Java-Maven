package Model;

import java.io.Serializable;

/**
 *
 * @author zier
 */
public class MyUser implements Serializable {

    private long id;
    private String userName;
    private String password;

    public MyUser(long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public MyUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public MyUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[" + "id=" + id + "userName=" + userName + ", password=" + password + "]\n";
    }

}
