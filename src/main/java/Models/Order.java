/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class Order {    
    private int od_id;
    private Date or_date;
    private String or_status;
    private String or_name;
    private String or_totalMoney;
    private String or_phoneNumber;
    private String or_email;
    private String or_address;
    private int user_id;

    public Order() {
    }

    public Order(int od_id, Date or_date, String or_status, String or_name, String or_totalMoney, String or_phoneNumber, String or_email, String or_address, int user_id) {
        this.od_id = od_id;
        this.or_date = or_date;
        this.or_status = or_status;
        this.or_name = or_name;
        this.or_totalMoney = or_totalMoney;
        this.or_phoneNumber = or_phoneNumber;
        this.or_email = or_email;
        this.or_address = or_address;
        this.user_id = user_id;
    }

    public int getOd_id() {
        return od_id;
    }

    public void setOd_id(int od_id) {
        this.od_id = od_id;
    }

    public Date getOr_date() {
        return or_date;
    }

    public void setOr_date(Date or_date) {
        this.or_date = or_date;
    }

    public String getOr_status() {
        return or_status;
    }

    public void setOr_status(String or_status) {
        this.or_status = or_status;
    }

    public String getOr_name() {
        return or_name;
    }

    public void setOr_name(String or_name) {
        this.or_name = or_name;
    }

    public String getOr_totalMoney() {
        return or_totalMoney;
    }

    public void setOr_totalMoney(String or_totalMoney) {
        this.or_totalMoney = or_totalMoney;
    }

    public String getOr_phoneNumber() {
        return or_phoneNumber;
    }

    public void setOr_phoneNumber(String or_phoneNumber) {
        this.or_phoneNumber = or_phoneNumber;
    }

    public String getOr_email() {
        return or_email;
    }

    public void setOr_email(String or_email) {
        this.or_email = or_email;
    }

    public String getOr_address() {
        return or_address;
    }

    public void setOr_address(String or_address) {
        this.or_address = or_address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
}
