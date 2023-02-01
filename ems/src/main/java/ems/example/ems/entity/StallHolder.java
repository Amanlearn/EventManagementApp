package ems.example.ems.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "Stall_Holder")
public class StallHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String mobile;
    private String Address;
    private String idProof;
    private ArrayList<Category> category;
    private ArrayList<StallType> stallType;
    private String gender;
    private String dob;
    private String description;

    public StallHolder() {
    }

    public StallHolder(int id, String name, String email, String mobile, String address, String idProof, ArrayList<Category> category, ArrayList<StallType> stallType, String gender, String dob, String description) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        Address = address;
        this.idProof = idProof;
        this.category = category;
        this.stallType = stallType;
        this.gender = gender;
        this.dob = dob;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public ArrayList<Category> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<Category> category) {
        this.category = category;
    }

    public ArrayList<StallType> getStallType() {
        return stallType;
    }

    public void setStallType(ArrayList<StallType> stallType) {
        this.stallType = stallType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "StallHolder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", Address='" + Address + '\'' +
                ", idProof='" + idProof + '\'' +
                ", category=" + category +
                ", stallType=" + stallType +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
