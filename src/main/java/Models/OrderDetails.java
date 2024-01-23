/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author nguye
 */
public class OrderDetails {
    private int od_id;
    private String od_price;
    private int od_quantity;
    private String totalMoney;
    private int order_id;
    private int pro_id;

    public OrderDetails() {
    }

    public OrderDetails(int od_id, String od_price, int od_quantity, String totalMoney, int order_id, int pro_id) {
        this.od_id = od_id;
        this.od_price = od_price;
        this.od_quantity = od_quantity;
        this.totalMoney = totalMoney;
        this.order_id = order_id;
        this.pro_id = pro_id;
    }

    public int getOd_id() {
        return od_id;
    }

    public void setOd_id(int od_id) {
        this.od_id = od_id;
    }

    public String getOd_price() {
        return od_price;
    }

    public void setOd_price(String od_price) {
        this.od_price = od_price;
    }

    public int getOd_quantity() {
        return od_quantity;
    }

    public void setOd_quantity(int od_quantity) {
        this.od_quantity = od_quantity;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }
    
}
