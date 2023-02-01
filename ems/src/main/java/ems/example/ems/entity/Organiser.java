package ems.example.ems.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Organiser")
public class Organiser {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int orgId;
    private String name;
    private String email;
    private String mobile;
    private String Address;
    private String idProof;
    private String profession;
    private String gender;
    private String dob;
    private String password;

    public Organiser() {
    }

    public Organiser(int orgId, String name, String email, String mobile, String address, String idProof, String profession, String gender, String dob, String password) {
        this.orgId = orgId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        Address = address;
        this.idProof = idProof;
        this.profession = profession;
        this.gender = gender;
        this.dob = dob;
        this.password = password;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Organiser{" +
                "orgId=" + orgId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", Address='" + Address + '\'' +
                ", idProof='" + idProof + '\'' +
                ", profession='" + profession + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
