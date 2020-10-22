package com.keelin.model;

import java.util.Date;

public class RotationerInfo {
    private Long id;

    private String provName;

    private String provCode;

    private String rotationInterval;

    private String position;

    private String name;

    private String phoneNumber;

    private Date rotationDate;

    private Integer isWhite;

    private Integer isLeader;

    private String phoneNumberBackup;

    private Integer isDelete;

    private Date opDate;

    private Date crtDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getRotationInterval() {
        return rotationInterval;
    }

    public void setRotationInterval(String rotationInterval) {
        this.rotationInterval = rotationInterval == null ? null : rotationInterval.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Date getRotationDate() {
        return rotationDate;
    }

    public void setRotationDate(Date rotationDate) {
        this.rotationDate = rotationDate;
    }

    public Integer getIsWhite() {
        return isWhite;
    }

    public void setIsWhite(Integer isWhite) {
        this.isWhite = isWhite;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public String getPhoneNumberBackup() {
        return phoneNumberBackup;
    }

    public void setPhoneNumberBackup(String phoneNumberBackup) {
        this.phoneNumberBackup = phoneNumberBackup == null ? null : phoneNumberBackup.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getOpDate() {
        return opDate;
    }

    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }
}