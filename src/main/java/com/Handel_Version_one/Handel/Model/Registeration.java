package com.Handel_Version_one.Handel.Model;

import javax.persistence.*;

@Entity
@Table(name="Client_Registeration")
public class Registeration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Client_id")
    private int id;

    @Column(name="entityName")
    private String entityName;
    @Column(name="iecCode")
    private String iecCode;
    @Column(name="gstCertificates")
    private String gstCertificates;
    @Column(name="finacialCetificates")
    private String finacialCetificates;
    @Column(name="userName")
    private String userName;
    @Column(name="mobileNumber")
    private Number mobileNumber;
    @Column(name="emailId")
    private String emailId;
    @Column(name="beneficiary")
    private String beneficiary;
    @Column(name="accuntNumber")
    private String accuntNumber;
    @Column(name="swiftCode")
    private String swiftCode;

    public Registeration() {
    }

    public Registeration(String entityName, String iecCode, String gstCertificates, String finacialCetificates, String userName, Number mobileNumber, String emailId, String beneficiary, String accuntNumber, String swiftCode) {

        this.entityName = entityName;
        this.iecCode = iecCode;
        this.gstCertificates = gstCertificates;
        this.finacialCetificates = finacialCetificates;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.beneficiary = beneficiary;
        this.accuntNumber = accuntNumber;
        this.swiftCode = swiftCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getIecCode() {
        return iecCode;
    }

    public void setIecCode(String iecCode) {
        this.iecCode = iecCode;
    }

    public String getGstCertificates() {
        return gstCertificates;
    }

    public void setGstCertificates(String gstCertificates) {
        this.gstCertificates = gstCertificates;
    }

    public String getFinacialCetificates() {
        return finacialCetificates;
    }

    public void setFinacialCetificates(String finacialCetificates) {
        this.finacialCetificates = finacialCetificates;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Number getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Number mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getAccuntNumber() {
        return accuntNumber;
    }

    public void setAccuntNumber(String accuntNumber) {
        this.accuntNumber = accuntNumber;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }
}

