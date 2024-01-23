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
public class Staff {
    private int staff_id;
    private String staff_salary;
    private String staff_gender;
    private Date staff_dayOff;
    private Date staff_dayJoin;
    private String staff_fullName;
    private String staff_phoneNumber;
    private String staff_address;
    private Date staff_dateOfBirth;
    private int acc_id;

    public Staff() {
    }

    public Staff(int staff_id, String staff_salary, String staff_gender, Date staff_dayOff, Date staff_dayJoin, String staff_fullName, String staff_phoneNumber, String staff_address, Date staff_dateOfBirth, int acc_id) {
        this.staff_id = staff_id;
        this.staff_salary = staff_salary;
        this.staff_gender = staff_gender;
        this.staff_dayOff = staff_dayOff;
        this.staff_dayJoin = staff_dayJoin;
        this.staff_fullName = staff_fullName;
        this.staff_phoneNumber = staff_phoneNumber;
        this.staff_address = staff_address;
        this.staff_dateOfBirth = staff_dateOfBirth;
        this.acc_id = acc_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(String staff_salary) {
        this.staff_salary = staff_salary;
    }

    public String getStaff_gender() {
        return staff_gender;
    }

    public void setStaff_gender(String staff_gender) {
        this.staff_gender = staff_gender;
    }

    public Date getStaff_dayOff() {
        return staff_dayOff;
    }

    public void setStaff_dayOff(Date staff_dayOff) {
        this.staff_dayOff = staff_dayOff;
    }

    public Date getStaff_dayJoin() {
        return staff_dayJoin;
    }

    public void setStaff_dayJoin(Date staff_dayJoin) {
        this.staff_dayJoin = staff_dayJoin;
    }

    public String getStaff_fullName() {
        return staff_fullName;
    }

    public void setStaff_fullName(String staff_fullName) {
        this.staff_fullName = staff_fullName;
    }

    public String getStaff_phoneNumber() {
        return staff_phoneNumber;
    }

    public void setStaff_phoneNumber(String staff_phoneNumber) {
        this.staff_phoneNumber = staff_phoneNumber;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public Date getStaff_dateOfBirth() {
        return staff_dateOfBirth;
    }

    public void setStaff_dateOfBirth(Date staff_dateOfBirth) {
        this.staff_dateOfBirth = staff_dateOfBirth;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
    
}
