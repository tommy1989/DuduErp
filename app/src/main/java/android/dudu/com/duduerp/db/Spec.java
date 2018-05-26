package android.dudu.com.duduerp.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/5/26.
 */

public class Spec extends DataSupport {
    private int id;
    private String spec_name;
    private String spec_params;
    private Goods goods;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getSpec_name(){
        return spec_name;
    }

    public void setSpec_name(String spec_name){
        this.spec_name = spec_name;
    }

    public String getSpec_params() {
        return spec_params;
    }

    public void setSpec_params(String spec_params) {
        this.spec_params = spec_params;
    }
}
