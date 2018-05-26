package android.dudu.com.duduerp.db;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2018/5/25.
 */

public class Goods extends DataSupport {
    private int id;
    private String goods_name;
    private int cost;
    private int price;
    private String imageUrl;
    private List<Spec> Specs = new ArrayList<Spec>();
    private category category;
    private String describe;
    private String remark;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getGoods_name(){
        return goods_name;
    }

    public void setGoods_name(String goods_name){
        this.goods_name = goods_name;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getDescribe(){
        return describe;
    }

    public void setDescribe(String describe){
        this.describe = describe;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }
}

