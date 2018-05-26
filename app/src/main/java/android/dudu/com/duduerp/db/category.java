package android.dudu.com.duduerp.db;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2018/5/26.
 */

public class category extends DataSupport {
    private int id;
    private int parent_id;
    private String cat_name;
    private List<Goods> goods = new ArrayList<Goods>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
}
