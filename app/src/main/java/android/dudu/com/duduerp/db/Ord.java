package android.dudu.com.duduerp.db;

/**
 * Created by ASUS on 2018/5/27.
 */

public class Ord {
    private int id;
    private String receiver;
    private int tel;
    private String address;
    private String remark;
    private int pay_status;
    private int gathering_status;
    private int shipping_status;
    private int ord_time;
    private String goods_name;
    private int goods_price;
    private int goods_cost;
    private int goods_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPay_status() {
        return pay_status;
    }

    public void setPay_status(int pay_status) {
        this.pay_status = pay_status;
    }

    public int getGathering_status() {
        return gathering_status;
    }

    public void setGathering_status(int gathering_status) {
        this.gathering_status = gathering_status;
    }

    public int getShipping_status() {
        return shipping_status;
    }

    public void setShipping_status(int shipping_status) {
        this.shipping_status = shipping_status;
    }

    public int getOrd_time() {
        return ord_time;
    }

    public void setOrd_time(int ord_time) {
        this.ord_time = ord_time;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public int getGoods_cost() {
        return goods_cost;
    }

    public void setGoods_cost(int goods_cost) {
        this.goods_cost = goods_cost;
    }

    public int getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(int goods_number) {
        this.goods_number = goods_number;
    }
}
