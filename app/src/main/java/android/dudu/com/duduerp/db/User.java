package android.dudu.com.duduerp.db;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/5/25.
 */

public class User extends DataSupport {
    private int id;

    private String username;

    @Column(unique = true)
    private int mobile;

    private String password;

    private int regtime;

    private int lastlogin;

    private int status;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getMobile(){
        return mobile;
    }

    public void setMobile(){
        this.mobile = mobile;
    }

    public int getRegtime(){
        return regtime;
    }

    public void setRegtime(int regtime){
        this.regtime = regtime;
    }

    public int getLastlogin(){
        return lastlogin;
    }

    public void setLastlogin(int lastlogin){
        this.lastlogin = lastlogin;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }
}
